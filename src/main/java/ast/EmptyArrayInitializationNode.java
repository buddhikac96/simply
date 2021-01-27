package ast;

import java.util.ArrayList;
import java.util.List;

public class EmptyArrayInitializationNode extends ArrayInitializationNode {
    List<ASTNode> arrayValues;

    public EmptyArrayInitializationNode() {
        this.arrayValues = new ArrayList<>();
    }
}
