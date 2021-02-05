package ast;

import visitors.AstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return this.libImportNodes.stream().map(node -> (ASTNode)node).collect(Collectors.toCollection(
                ArrayList<ASTNode>::new
        ));
    }

    @Override
    public void accept(AstVisitor visitor) {
        for(ASTNode node : this.getChildren()){
            node.accept(visitor);
        }
        visitor.visit(this);
    }
}
