package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends ASTNode {
    List<StatementNode> statementNodeList;

    public BlockNode() {
        this.statementNodeList = new ArrayList<>();
    }

    public void addStatementNode(StatementNode statementNode){
        this.statementNodeList.add(statementNode);
    }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(this.statementNodeList);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}

