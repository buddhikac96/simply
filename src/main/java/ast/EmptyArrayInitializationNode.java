package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayInitializationNode extends ArrayInitializationNode {

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
        return "EmptyArrayInitializationNode{}";
    }
}
