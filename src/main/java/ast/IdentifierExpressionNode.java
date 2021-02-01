package ast;

public class IdentifierExpressionNode extends ExpressionNode{
    String name;

    public IdentifierExpressionNode(String name) {
        this.name = name;
    }
}
