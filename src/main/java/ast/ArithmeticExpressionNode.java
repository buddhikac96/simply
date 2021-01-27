package ast;

public abstract class ArithmeticExpressionNode extends ExpressionNode {

    public static class AdditionExpressionNode extends ArithmeticExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public AdditionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static class DivisionExpressionNode extends ArithmeticExpressionNode{
        ExpressionNode left;
        ExpressionNode right;

        public DivisionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static class ModulusExpressionNode extends ArithmeticExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public ModulusExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static class MultiplicationExpressionNode extends ArithmeticExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public MultiplicationExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }
    }

    public static class SubtractionExpressionNode extends ArithmeticExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public SubtractionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }
    }
}
