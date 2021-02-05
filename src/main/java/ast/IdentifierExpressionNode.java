package ast;

import visitors.AstVisitor;

import java.util.List;

public class IdentifierExpressionNode extends ExpressionNode{
    String name;

    public IdentifierExpressionNode(String name) {
        this.name = name;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
