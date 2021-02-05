package ast;

import visitors.BaseAstVisitor;

import java.util.List;

public abstract class LogicExpressionNode extends ExpressionNode {
    public static class OrExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public OrExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class AndExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public AndExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class GreaterThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public GreaterThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class LessThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public LessThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class GreaterOrEqualThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public GreaterOrEqualThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class LessOrEqualThanExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public LessOrEqualThanExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class EqualsExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public EqualsExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public List<ASTNode> getChildren() {
            return null;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {

        }
    }

    public static class NotEqualsExpressionNode extends LogicExpressionNode {
        ExpressionNode left;
        ExpressionNode right;

        public NotEqualsExpressionNode(ExpressionNode left, ExpressionNode right) {
            this.left = left;
            this.right = right;
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
