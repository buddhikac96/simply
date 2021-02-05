package ast;

import visitors.AstVisitor;

import java.util.ArrayList;
import java.util.List;

public class IfStatementNode extends StatementNode {
    private IfBlockNode ifBlockNode;
    private final List<IfBlockNode> elseIfBlockNodeList;
    private ElseBlockNode elseBlockNode;

    public IfStatementNode(IfBlockNode ifBlockNode, ElseBlockNode elseBlockNode) {
        this.ifBlockNode = ifBlockNode;
        this.elseBlockNode = elseBlockNode;
        this.elseIfBlockNodeList = new ArrayList<>();
    }

    public IfStatementNode(IfBlockNode ifBlockNode) {
        this.ifBlockNode = ifBlockNode;
        this.elseIfBlockNodeList = new ArrayList<>();
    }

    public void addElseIfBlockNode(IfBlockNode IfBlockNode){
        this.elseIfBlockNodeList.add(IfBlockNode);
    }

    public List<IfBlockNode> getElseIfBlockNodeList() {
        return elseIfBlockNodeList;
    }

    public IfBlockNode getIfBlockNode() {
        return ifBlockNode;
    }

    public void setIfBlockNode(IfBlockNode ifBlockNode) {
        this.ifBlockNode = ifBlockNode;
    }

    public ElseBlockNode getElseBlockNode() {
        return elseBlockNode;
    }

    public void setElseBlockNode(ElseBlockNode elseBlockNode) {
        this.elseBlockNode = elseBlockNode;
    }

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }


    // If block node AST class
    public static class IfBlockNode extends ASTNode{
        private ExpressionNode conditionExpressionNode;
        private BlockNode blockNode;

        public IfBlockNode(ExpressionNode conditionExpressionNode, BlockNode blockNode) {
            this.conditionExpressionNode = conditionExpressionNode;
            this.blockNode = blockNode;
        }

        public ExpressionNode getConditionExpressionNode() {
            return conditionExpressionNode;
        }

        public void setConditionExpressionNode(ExpressionNode conditionExpressionNode) {
            this.conditionExpressionNode = conditionExpressionNode;
        }

        public BlockNode getBlockNode() {
            return blockNode;
        }

        public void setBlockNode(BlockNode blockNode) {
            this.blockNode = blockNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(AstVisitor visitor) {

        }
    }




    // Else block node AST class
    public static class ElseBlockNode extends ASTNode{
        private BlockNode blockNode;

        public ElseBlockNode(BlockNode blockNode) {
            this.blockNode = blockNode;
        }

        public BlockNode getBlockNode() {
            return blockNode;
        }

        public void setBlockNode(BlockNode blockNode) {
            this.blockNode = blockNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(AstVisitor visitor) {

        }
    }
}


