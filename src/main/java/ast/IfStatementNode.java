package ast;

import java.util.ArrayList;
import java.util.List;

public class IfStatementNode extends StatementNode {
    IfBlockNode ifBlockNode;
    List<IfBlockNode> elseIfBlockNodeList;
    ElseBlockNode elseBlockNode;

    public IfStatementNode(IfBlockNode ifBlockNode, ElseBlockNode elseBlockNode) {
        this.ifBlockNode = ifBlockNode;
        this.elseBlockNode = elseBlockNode;
        this.elseIfBlockNodeList = new ArrayList<>();
    }

    public void addElseIfBlockNode(IfBlockNode IfBlockNode){
        this.elseIfBlockNodeList.add(IfBlockNode);
    }
}

class IfBlockNode extends ASTNode{
    ExpressionNode conditionExpressionNode;
    BlockNode blockNode;

    public IfBlockNode(ExpressionNode conditionExpressionNode, BlockNode blockNode) {
        this.conditionExpressionNode = conditionExpressionNode;
        this.blockNode = blockNode;
    }
}


class ElseBlockNode extends ASTNode{
    BlockNode blockNode;

    public ElseBlockNode(BlockNode blockNode) {
        this.blockNode = blockNode;
    }
}
