package ast;

public class ArrayAccess extends ASTNode {
    ExpressionNode expressionNode;

    public ArrayAccess(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }
}
