package ast;

import visitors.BaseAstVisitor;

import java.util.List;

public abstract class UnaryExpressionNode extends ExpressionNode {

    public static class ParenExpressionNode extends ExpressionNode {
        ExpressionNode expressionNode;

        public ParenExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class PrefixPlusExpressionNode extends ExpressionNode {
        ExpressionNode expressionNode;

        public PrefixPlusExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class PrefixMinusExpressionNode extends ExpressionNode{
        ExpressionNode expressionNode;

        public PrefixMinusExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class PrefixNotExpressionNode extends ExpressionNode{
        ExpressionNode expressionNode;

        public PrefixNotExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }
}
