package ast;

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
}

