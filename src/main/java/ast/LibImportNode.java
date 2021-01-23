package ast;

public class LibImportNode extends ASTNode {
    String LibName;

    public LibImportNode(String libName) {
        LibName = libName;
    }
}
