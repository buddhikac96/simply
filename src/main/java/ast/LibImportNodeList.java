package ast;

import visitors.BaseAstVisitor;

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


    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(this.libImportNodes);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
