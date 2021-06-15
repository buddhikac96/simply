package app;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.ASTNode;
import ast.CompilationUnitNode;
import ast.astImgGenerator.AstDotGenerator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import passes.cst2ast.Cst2AstPassVisitor;
import passes.semantic.SemanticAnalyzerPassVisitor;
import passes.transpiler.SimplyTranspiler;
import syntaxerror.SyntaxErrorListener;
import universalJavaPortal.JavaPortalServiceProvider;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    private static final SyntaxErrorListener syntaxErrorListener = new SyntaxErrorListener();

    public static void main(String[] args) throws Exception {
        try{
            String filePath = args[0];
            if(!Files.exists(Paths.get(filePath))){
                throw new Exception("Simply file: " + filePath + " not exist!");
            }

            String universalLibResource = args[1];
            if(!Files.exists(Paths.get(universalLibResource))){
                throw new Exception("JSON Library resource not found in location: " + universalLibResource);
            }

            System.out.println("===================== Simply ======================\n\n");

            // TODO: Catch syntax errors
            ParseTree tree = getParseTree(filePath);
            System.out.println("---------------------------------------------------");
            System.out.println("PARSE SUCCESSFUL");
            System.out.println("---------------------------------------------------\n\n");


            //syntax errors
            var syntaxErrors = syntaxErrorListener.getSyntaxErrors();
            if(!syntaxErrors.isEmpty()){
                SimplySystem.exit(syntaxErrors);
            }

            // Convert CST into AST
            List<String> errors = new ArrayList<>();
            Cst2AstPassVisitor cst2AstPassVisitor = new Cst2AstPassVisitor(errors);
            CompilationUnitNode astRoot = (CompilationUnitNode) cst2AstPassVisitor.visit(tree);
            System.out.println("---------------------------------------------------");
            System.out.println("CST -> AST TRANSLATION SUCCESSFUL");
            System.out.println("---------------------------------------------------\n\n");

            // Generate AST Image
            AstDotGenerator.draw(astRoot);
            System.out.println("---------------------------------------------------");
            System.out.println("AST VISUALISATION GENERATION SUCCESSFUL");
            System.out.println("---------------------------------------------------\n\n");

            // Java Library provider
            var sfm = new JavaPortalServiceProvider(universalLibResource);

            // Semantics analyzing
            var semanticAnalyzerPassVisitor = new SemanticAnalyzerPassVisitor(sfm);
            astRoot.accept(semanticAnalyzerPassVisitor);
            System.out.println("---------------------------------------------------");
            System.out.println("SEMANTIC ANALYZING SUCCESSFUL");
            System.out.println("---------------------------------------------------\n\n");

            generateCode(astRoot);
            System.out.println("---------------------------------------------------");
            System.out.println("TRANSPILING SUCCESSFUL");
            System.out.println("---------------------------------------------------\n\n");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid arguments");
            System.out.println("Required: <Simply source file path> <Universal Library Resource>");
            System.exit(-1);
        }catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    private static ParseTree getParseTree(String path) throws IOException {
        CharStream charStream = CharStreams.fromFileName(path);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);
        parser.addErrorListener(syntaxErrorListener);
        return parser.compilationUnit();
    }

    private static void generateCode(ASTNode node) throws IOException {
        SimplyTranspiler transpiler = new SimplyTranspiler();
        node.accept(transpiler);
        File output = new File("output");
        if(!output.exists()){
            System.out.println("Creating new folder : output");
            output.mkdir();
        }else{
            for(File f : output.listFiles()){
                f.delete();
            }
        }
        System.out.println("Writing Main.java");
        String code = transpiler.code.toString();
        FileWriter fileWriter = new FileWriter("output/Main.java");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(code);
        printWriter.close();
        fileWriter.close();
        System.out.println("Main.java file created in location : output/Main.java\n\n");
    }
}
