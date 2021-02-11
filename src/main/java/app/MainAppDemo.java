package app;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.CompilationUnitNode;
import ast.gui.AstDotGenerator;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.Cst2Ast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainAppDemo {
    public static void main(String[] args) throws IOException {

        String filePath = "Samples/sample.simply";

        CharStream charStream = CharStreams.fromFileName(filePath);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        ParseTree tree = parser.compilationUnit();

        List<String> errors = new ArrayList<>();

        Cst2Ast cst2Ast = new Cst2Ast(errors);
        CompilationUnitNode astRoot = (CompilationUnitNode) cst2Ast.visit(tree);

        /*TestAstVisitor testAstVisitor = new TestAstVisitor();
        astRoot.accept(testAstVisitor);*/

        AstDotGenerator.draw(astRoot);


    }
}
