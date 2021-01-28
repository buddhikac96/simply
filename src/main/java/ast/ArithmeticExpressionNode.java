package ast;

public abstract class ArithmeticExpressionNode extends ExpressionNode {

    public static class AdditionExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public AdditionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        public ExpressionNode getLeft() {
            return left;
        }

        public void setLeft(ExpressionNode left) {
            this.left = left;
        }

        public ExpressionNode getRight() {
            return right;
        }

        public void setRight(ExpressionNode right) {
            this.right = right;
        }
    }

    public static class DivisionExpressionNode extends ArithmeticExpressionNode{
        private ExpressionNode left;
        private ExpressionNode right;

        public DivisionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        public ExpressionNode getLeft() {
            return left;
        }

        public void setLeft(ExpressionNode left) {
            this.left = left;
        }

        public ExpressionNode getRight() {
            return right;
        }

        public void setRight(ExpressionNode right) {
            this.right = right;
        }
    }

    public static class ModulusExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public ModulusExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        public ExpressionNode getLeft() {
            return left;
        }

        public void setLeft(ExpressionNode left) {
            this.left = left;
        }

        public ExpressionNode getRight() {
            return right;
        }

        public void setRight(ExpressionNode right) {
            this.right = right;
        }
    }

    public static class MultiplicationExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public MultiplicationExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        public ExpressionNode getLeft() {
            return left;
        }

        public void setLeft(ExpressionNode left) {
            this.left = left;
        }

        public ExpressionNode getRight() {
            return right;
        }

        public void setRight(ExpressionNode right) {
            this.right = right;
        }
    }

    public static class SubtractionExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public SubtractionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        public ExpressionNode getLeft() {
            return left;
        }

        public void setLeft(ExpressionNode left) {
            this.left = left;
        }

        public ExpressionNode getRight() {
            return right;
        }

        public void setRight(ExpressionNode right) {
            this.right = right;
        }
    }
}
