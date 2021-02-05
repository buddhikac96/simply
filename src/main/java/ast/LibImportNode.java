package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class LibImportNode extends ASTNode {
    private String LibName;

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
}
