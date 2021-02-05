package ast;

import visitors.BaseAstVisitor;

import java.util.List;

public class ArrayAccessNode extends ASTNode {
    ExpressionNode expressionNode;

    public ArrayAccessNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {

    }
}
