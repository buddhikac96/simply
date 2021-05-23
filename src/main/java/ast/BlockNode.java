package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BlockNode extends ASTNode {
    List<StatementNode> statementNodeList;

    @Override
    public String toString() {
        return "BlockNode{" +
                "statementNodeList=" + statementNodeList +
                '}';
    }

    public BlockNode() {
        this.statementNodeList = new ArrayList<>();
    }

    public void addStatementNode(StatementNode statementNode){
        this.statementNodeList.add(statementNode);
    }

    public List<StatementNode> getStatementNodeList() { return this.statementNodeList; }

    @Override
    public List<ASTNode> getChildren() {
        return new ArrayList<>(this.statementNodeList);
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        visitor.enterBlockNode(this);
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }
}
