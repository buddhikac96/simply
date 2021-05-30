package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class LibImportNode extends ASTNode {
    private final String LibName;

    public LibImportNode(String libName) {
        LibName = libName;
    }

    public String getLibName() {
        return LibName;
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
        return "LibImportNode{" +
                "LibName='" + LibName + '\'' +
                '}';
    }
}
