package visitors;

import antlr.gen.SimplyV3Lexer;
import antlr.gen.SimplyV3Parser;
import ast.CompilationUnitNode;
import ast.LibImportNode;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class AstVisitor {
    public static void main(String[] args) throws IOException {

        String filePath = "Samples/sample.simply";

        CharStream charStream = CharStreams.fromFileName(filePath);
        SimplyV3Lexer lexer = new SimplyV3Lexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        SimplyV3Parser parser = new SimplyV3Parser(commonTokenStream);

        ParseTree tree = parser.compilationUnit();

        Cst2Ast cst2Ast = new Cst2Ast();
        CompilationUnitNode ast = (CompilationUnitNode) cst2Ast.visit(tree);

        System.out.println(ast.libImportNodeList.size());
        System.out.println(ast.globalVariableDeclarationNodeList.size());

        for(LibImportNode libImportNode : ast.libImportNodeList){
            System.out.println(libImportNode.getLibName());
        }

    }
}
