package sampletest;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.CompilationUnitNode;
import ast.util.enums.DataType;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import passes.Cst2AstPassVisitor;
import passes.PreEvaluatePassVisitor;
import passes.SyntaxAnalyzerPassVisitor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        String filePath = "src/test/SampleCodeTest/libimport/test1.simply";

        CharStream charStream = CharStreams.fromFileName(filePath);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        ParseTree tree = parser.compilationUnit();

        List<String> errors = new ArrayList<>();

        Cst2AstPassVisitor cst2AstPassVisitor = new Cst2AstPassVisitor(errors);
        CompilationUnitNode astRoot = (CompilationUnitNode) cst2AstPassVisitor.visit(tree);


        PreEvaluatePassVisitor preEvaluatePassVisitor = new PreEvaluatePassVisitor();
        astRoot.accept(preEvaluatePassVisitor);

        HashMap<String, HashSet<ArrayList<DataType>>> userDefinedFunctionList = preEvaluatePassVisitor.getFunctions();

        // Syntax analyzing
        SyntaxAnalyzerPassVisitor syntaxAnalyzerPassVisitor = new SyntaxAnalyzerPassVisitor(userDefinedFunctionList);
        astRoot.accept(syntaxAnalyzerPassVisitor);

    }
}
