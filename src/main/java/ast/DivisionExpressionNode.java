package ast;

public class DivisionExpressionNode extends ExpressionNode {
    ASTNode left;
    ASTNode right;

    public DivisionExpressionNode(ASTNode left, ASTNode right) {
        this.left = left;
        this.right = right;
    }
}
