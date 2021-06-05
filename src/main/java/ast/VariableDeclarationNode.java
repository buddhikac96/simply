package ast;

public abstract class VariableDeclarationNode extends StatementNode {
    public abstract void setConst();

    public abstract IdentifierNode getName();
}

