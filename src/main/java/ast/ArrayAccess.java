package ast;

import visitors.AstVisitor;

import java.util.List;

public class ArrayAccess extends ASTNode {
    ExpressionNode expressionNode;

    public ArrayAccess(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
