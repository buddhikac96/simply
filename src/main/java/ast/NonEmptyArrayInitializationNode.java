package ast;

import visitors.AstVisitor;

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
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
