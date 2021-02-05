package ast;

import visitors.AstVisitor;

import java.util.ArrayList;
import java.util.List;

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
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
