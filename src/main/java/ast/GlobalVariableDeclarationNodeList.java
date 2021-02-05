package ast;

import visitors.AstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GlobalVariableDeclarationNodeList extends ASTNode {

    private final List<VariableDeclarationNode> variableDeclarationNodes;

    public GlobalVariableDeclarationNodeList() {
        this.variableDeclarationNodes = new ArrayList<>();
    }

    public void addNode(VariableDeclarationNode variableDeclarationNode){
        this.variableDeclarationNodes.add(variableDeclarationNode);
    }

    public List<VariableDeclarationNode> getVariableDeclarationNodes() {
        return variableDeclarationNodes;
    }

    @Override
    public List<ASTNode> getChildren() {
        return this.variableDeclarationNodes.stream().map(node -> (ASTNode)node).collect(Collectors.toCollection(
                ArrayList<ASTNode>::new
        ));
    }

    @Override
    public void accept(AstVisitor visitor) {
        this.getChildren().forEach(node -> accept(visitor));
        visitor.visit(this);
    }
}
