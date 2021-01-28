package ast;

public abstract class UnaryExpressionNode extends ExpressionNode {

    public static class ParenExpressionNode extends ExpressionNode {
        ExpressionNode expressionNode;

        public ParenExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }
    }

    public static class PrefixPlusExpressionNode extends ExpressionNode {
        ExpressionNode expressionNode;

        public PrefixPlusExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }
    }

    public static class PrefixMinusExpressionNode extends ExpressionNode{
        ExpressionNode expressionNode;

        public PrefixMinusExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }
    }

    public static class PrefixNotExpression extends ExpressionNode{
        ExpressionNode expressionNode;

        public PrefixNotExpression(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }
    }
}
