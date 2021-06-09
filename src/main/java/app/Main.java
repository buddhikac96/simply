package app;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.ASTNode;
import ast.CompilationUnitNode;
import ast.astImgGenerator.AstDotGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import passes.cst2ast.Cst2AstPassVisitor;
import passes.semantic.SemanticAnalyzerPassVisitor;
import passes.transpiler.SimplyTranspiler;
import universalJavaPortal.JavaPortalServiceProvider;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {

        try{

            String filePath = args[0];

            if(!Files.exists(Paths.get(filePath))){
                throw new Exception("File path: " + filePath + " not exist!");
            }

            System.out.println("=============== Simply =================\n\n");

            System.out.println("Start Parsing");
            ParseTree tree = getParseTree(filePath);
            System.out.println("Parsed successfully");

            List<String> errors = new ArrayList<>();

            // Convert CST into AST
            System.out.println("Building AST");
            Cst2AstPassVisitor cst2AstPassVisitor = new Cst2AstPassVisitor(errors);
            CompilationUnitNode astRoot = (CompilationUnitNode) cst2AstPassVisitor.visit(tree);
            System.out.println("Build AST successful");

            // Generate AST Image
            System.out.println("Building AST visualization");
            AstDotGenerator.draw(astRoot);
            System.out.println("Building AST visualization successful");

            // Java Library provider
            var sfm = new JavaPortalServiceProvider();

            // Semantics analyzing
            System.out.println("Semantic analyzing stated");
            var semanticAnalyzerPassVisitor = new SemanticAnalyzerPassVisitor(sfm);
            astRoot.accept(semanticAnalyzerPassVisitor);
            System.out.println("Semantic analyzing successful");

            System.out.println("Transpiling started");
            generateCode(astRoot);
            System.out.println("Transpiling successful");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid arguments");
            System.out.println("Required: <Simply source file path>");
            System.out.println("Provided: None");
            System.exit(-1);
        }catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }

    }

    private static ParseTree getParseTree(String path) throws IOException {
        CharStream charStream = CharStreams.fromFileName(path);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        return parser.compilationUnit();
    }

    private static void generateCode(ASTNode node) {
        SimplyTranspiler transpiler = new SimplyTranspiler();
        node.accept(transpiler);

        System.out.println(transpiler.code);
    }
}
