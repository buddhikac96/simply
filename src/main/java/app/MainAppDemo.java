package app;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.ASTNode;
import ast.CompilationUnitNode;
import ast.astImgGenerator.AstDotGenerator;
import errors.SimplyError;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import passes.cst2ast.Cst2AstPassVisitor;
import passes.semantic.SemanticAnalyzerPassVisitor;
import passes.transpiler.SimplyTranspiler;
import universalJavaPortal.JavaPortalServiceProvider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MainAppDemo {

    private static final Logger LOGGER = Logger.getLogger(MainAppDemo.class.getName());

    public static void main(String[] args) throws Exception {

        String filePath = "Samples/sample2.simply";
        ParseTree tree = getParseTree(filePath);

        List<String> errors = new ArrayList<>();

        // Convert CST into AST
        Cst2AstPassVisitor cst2AstPassVisitor = new Cst2AstPassVisitor(errors);
        CompilationUnitNode astRoot = (CompilationUnitNode) cst2AstPassVisitor.visit(tree);

        // Generate AST Image
        AstDotGenerator.draw(astRoot);

        // Error List for semantic analysis
        List<SimplyError> simplyErrorList = new ArrayList<>();

        // Java Library provider
        var sfm = new JavaPortalServiceProvider();

        // Semantics analyzing
        var semanticAnalyzerPassVisitor = new SemanticAnalyzerPassVisitor(simplyErrorList, sfm);

        generateCode(astRoot);
    }

    private static ParseTree getParseTree(String path) throws IOException {
        CharStream charStream = CharStreams.fromFileName(path);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        return parser.compilationUnit();
    }

    private static void generateCode(ASTNode node) {
        // TempTranspiler transpiler = new TempTranspiler();
        SimplyTranspiler transpiler = new SimplyTranspiler();
        node.accept(transpiler);

        System.out.println(transpiler.code);
    }
}
