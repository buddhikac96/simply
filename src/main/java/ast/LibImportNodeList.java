package ast;

import java.util.ArrayList;
import java.util.List;

public class LibImportNodeList extends ASTNode {

    private final List<LibImportNode> libImportNodes;

    public LibImportNodeList() {
        this.libImportNodes = new ArrayList<>();
    }

    public void addNode(LibImportNode libImportNode){
        this.libImportNodes.add(libImportNode);
    }

    public List<LibImportNode> getLibImportNodes() {
        return libImportNodes;
    }
}
