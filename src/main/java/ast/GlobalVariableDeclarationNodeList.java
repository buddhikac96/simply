package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        return new ArrayList<>(this.variableDeclarationNodes);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
