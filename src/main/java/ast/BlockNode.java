package ast;

import visitors.AstVisitor;

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
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}

