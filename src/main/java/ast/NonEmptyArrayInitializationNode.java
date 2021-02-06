package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class NonEmptyArrayInitializationNode extends ArrayInitializationNode {
    List<ExpressionNode> arrayValues;

    public NonEmptyArrayInitializationNode() {
        this.arrayValues = new ArrayList<>();
    }

    public void addValues(ExpressionNode expressionNode) {
        this.arrayValues.add(expressionNode);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(this.arrayValues);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
