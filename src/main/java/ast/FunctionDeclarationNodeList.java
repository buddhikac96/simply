package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionDeclarationNodeList extends ASTNode {

    private final List<FunctionDeclarationNode> functionDeclarationNodes;

    public FunctionDeclarationNodeList() {
        this.functionDeclarationNodes = new ArrayList<>();
    }

    public void addNode(FunctionDeclarationNode functionDeclarationNode){
        this.functionDeclarationNodes.add(functionDeclarationNode);
    }

    public List<FunctionDeclarationNode> getFunctionDeclarationNodes() {
        return functionDeclarationNodes;
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<ASTNode>(this.functionDeclarationNodes);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
