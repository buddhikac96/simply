package ast;

import java.util.ArrayList;
import java.util.List;

public abstract class ArrayInitializationNode extends ASTNode {

}

class EmptyArrayInitializationNode extends ArrayInitializationNode{
    List<ExpressionNode> arrayValues;

    public EmptyArrayInitializationNode() {
        this.arrayValues = new ArrayList<>();
    }
}

class NonEmptyArrayInitializationNode extends ArrayInitializationNode{
    List<ExpressionNode> arrayValues;

    public NonEmptyArrayInitializationNode() {
        this.arrayValues = new ArrayList<>();
    }

    public void addValues(ExpressionNode expressionNode){
        this.arrayValues.add(expressionNode);
    }
}
