package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class IdentifierNode extends ExpressionNode{
    String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        visitor.visit(this);
    }
}
