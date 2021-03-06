package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        List<ASTNode> children = new ArrayList<>();
        children.add(this.ifBlockNode);
        children.addAll(this.elseIfBlockNodeList);
        children.add(this.elseBlockNode);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "IfStatementNode{" +
                "ifBlockNode=" + ifBlockNode +
                ", elseIfBlockNodeList=" + elseIfBlockNodeList +
                ", elseBlockNode=" + elseBlockNode +
                '}';
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
            List<ASTNode> children = new ArrayList<>();
            children.add(this.conditionExpressionNode);
            children.add(this.blockNode);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "IfBlockNode{" +
                    "conditionExpressionNode=" + conditionExpressionNode +
                    ", blockNode=" + blockNode +
                    '}';
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
            List<ASTNode> children = new ArrayList<>();
            children.add(this.blockNode);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "ElseBlockNode{" +
                    "blockNode=" + blockNode +
                    '}';
        }
    }
}