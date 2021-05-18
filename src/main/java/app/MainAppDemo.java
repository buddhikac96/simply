package app;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.CompilationUnitNode;
import ast.gui.AstDotGenerator;
import ast.util.enums.DataType;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import passes.Cst2AstPassVisitor;
import passes.PreEvaluatePassVisitor;
import passes.semantic.SemanticAnalyzerPassVisitor;
import passes.transpiler.OriginalTranspiler;
import passes.transpiler.TempTranspiler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;

public class MainAppDemo {

    private static final Logger LOGGER = Logger.getLogger(MainAppDemo.class.getName());

    public static void main(String[] args) throws IOException {

        String filePath = "Samples/sample2.simply";

        CharStream charStream = CharStreams.fromFileName(filePath);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        ParseTree tree = parser.compilationUnit();

        List<String> errors = new ArrayList<>();

        // Convert CST into AST
        Cst2AstPassVisitor cst2AstPassVisitor = new Cst2AstPassVisitor(errors);
        CompilationUnitNode astRoot = (CompilationUnitNode) cst2AstPassVisitor.visit(tree);

        // Generate AST Image
        AstDotGenerator.draw(astRoot);


        // pre-evaluation pass
        // get the function list data structure
        // pass data structure to syntax analyzing phase

        PreEvaluatePassVisitor preEvaluatePassVisitor = new PreEvaluatePassVisitor();
        astRoot.accept(preEvaluatePassVisitor);

        HashMap<String, HashSet<ArrayList<DataType>>> userDefinedFunctionList = preEvaluatePassVisitor.getFunctions();

        // Semantics analyzing

        SemanticAnalyzerPassVisitor semanticAnalyzerPassVisitor = new SemanticAnalyzerPassVisitor(userDefinedFunctionList);
        astRoot.accept(semanticAnalyzerPassVisitor);

        // TempTranspiler transpiler = new TempTranspiler();
        OriginalTranspiler transpiler = new OriginalTranspiler();
        astRoot.accept(transpiler);

        System.out.println(transpiler.code);
    }
}
