package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class ArrayAccessNode extends ASTNode {
    ExpressionNode expressionNode;

    public ArrayAccessNode(ExpressionNode expressionNode) {
        this.expressionNode = expressionNode;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<ASTNode>();
        children.add(this.expressionNode);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
