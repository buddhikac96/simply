package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class IdentifierNode extends ExpressionNode{
    private String name;

    public IdentifierNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>();
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IdentifierNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
