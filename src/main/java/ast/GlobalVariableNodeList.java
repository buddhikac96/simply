package ast;

import java.util.ArrayList;
import java.util.List;

public class GlobalVariableNodeList extends ASTNode {

    private final List<VariableDeclarationNode> variableDeclarationNodes;

    public GlobalVariableNodeList() {
        this.variableDeclarationNodes = new ArrayList<>();
    }

    public void addNode(VariableDeclarationNode variableDeclarationNode){
        this.variableDeclarationNodes.add(variableDeclarationNode);
    }

    public List<VariableDeclarationNode> getVariableDeclarationNodes() {
        return variableDeclarationNodes;
    }
}
