package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayInitializationNode extends ArrayInitializationNode {
    List<ASTNode> arrayValues;

    public EmptyArrayInitializationNode() {
        this.arrayValues = new ArrayList<>();
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {

    }
}
