package ast;

import visitors.AstVisitor;

import java.util.List;

public abstract class ArithmeticExpressionNode extends ExpressionNode {

    public static class AdditionExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public AdditionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }


        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(AstVisitor visitor) {

        }
    }

    public static class DivisionExpressionNode extends ArithmeticExpressionNode{
        private ExpressionNode left;
        private ExpressionNode right;

        public DivisionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(AstVisitor visitor) {

        }
    }

    public static class ModulusExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public ModulusExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(AstVisitor visitor) {

        }
    }

    public static class MultiplicationExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public MultiplicationExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(AstVisitor visitor) {

        }
    }

    public static class SubtractionExpressionNode extends ArithmeticExpressionNode {
        private ExpressionNode left;
        private ExpressionNode right;

        public SubtractionExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
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
