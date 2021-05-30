package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NonEmptyArrayInitializationNode extends ArrayInitializationNode {
    final List<ExpressionNode> arrayValues;

    public NonEmptyArrayInitializationNode() {
        this.arrayValues = new ArrayList<>();
    }

    public void addValues(ExpressionNode expressionNode) {
        this.arrayValues.add(expressionNode);
    }

    public List<ExpressionNode> getArrayValues() { return this.arrayValues; }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(this.arrayValues);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "NonEmptyArrayInitializationNode{" +
                "arrayValues=" + arrayValues +
                '}';
    }
}
