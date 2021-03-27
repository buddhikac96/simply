package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class UnaryExpressionNode extends ExpressionNode {

    public static class ParenExpressionNode extends UnaryExpressionNode {
        ExpressionNode expressionNode;

        public ParenExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(expressionNode);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "ParenExpressionNode{" +
                    "expressionNode=" + expressionNode +
                    '}';
        }
    }

    public static class PrefixPlusExpressionNode extends UnaryExpressionNode {
        ExpressionNode expressionNode;

        public PrefixPlusExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(expressionNode);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "PrefixPlusExpressionNode{" +
                    "expressionNode=" + expressionNode +
                    '}';
        }
    }

    public static class PrefixMinusExpressionNode extends UnaryExpressionNode{
        ExpressionNode expressionNode;

        public PrefixMinusExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(expressionNode);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "PrefixMinusExpressionNode{" +
                    "expressionNode=" + expressionNode +
                    '}';
        }
    }

    public static class PrefixNotExpressionNode extends UnaryExpressionNode{
        ExpressionNode expressionNode;

        public PrefixNotExpressionNode(ExpressionNode expressionNode) {
            this.expressionNode = expressionNode;
        }

        @Override
        public List<ASTNode> getChildren() {
            List<ASTNode> children = new ArrayList<>();
            children.add(expressionNode);
            return children;
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "PrefixNotExpressionNode{" +
                    "expressionNode=" + expressionNode +
                    '}';
        }
    }
}
