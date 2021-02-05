package ast;

import visitors.AstVisitor;

import java.util.List;

public class LibImportNode extends ASTNode {
    String LibName;

    public LibImportNode(String libName) {
        LibName = libName;
    }

    public String getLibName() {
        return LibName;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
