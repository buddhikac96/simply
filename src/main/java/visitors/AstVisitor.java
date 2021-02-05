package visitors;

import ast.CompilationUnitNode;
import ast.FunctionDeclarationNodeList;
import ast.GlobalVariableDeclarationNodeList;
import ast.LibImportNodeList;

public abstract class AstVisitor<T> {
    public abstract T visit(CompilationUnitNode node);
    public abstract T visit(LibImportNodeList node);
    public abstract T visit(GlobalVariableDeclarationNodeList node);
    public abstract T visit(FunctionDeclarationNodeList node);
}
