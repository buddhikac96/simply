package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public abstract class LiteralExpressionNode extends ExpressionNode {

    public static class IntegerLiteralExpressionNode extends LiteralExpressionNode {
        private int value;

        public IntegerLiteralExpressionNode(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public List<ASTNode> getChildren() {
            return new ArrayList<>();
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "IntegerLiteralExpressionNode{" +
                    "value=" + value +
                    '}';
        }
    }

    public static class FloatLiteralExpressionNode extends LiteralExpressionNode {
        private float value;

        public FloatLiteralExpressionNode(float value) {
            this.value = value;
        }

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }

        @Override
        public List<ASTNode> getChildren() {
            return new ArrayList<>();
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "FloatLiteralExpressionNode{" +
                    "value=" + value +
                    '}';
        }
    }

    public static class CharLiteralExpressionNode extends LiteralExpressionNode {
        private char value;

        public CharLiteralExpressionNode(char value) {
            this.value = value;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        @Override
        public List<ASTNode> getChildren() {
            return new ArrayList<>();
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "CharLiteralExpressionNode{" +
                    "value=" + value +
                    '}';
        }
    }

    public static class StringLiteralExpressionNode extends LiteralExpressionNode {
        private String value;

        public StringLiteralExpressionNode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public List<ASTNode> getChildren() {
            return new ArrayList<>();
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "StringLiteralExpressionNode{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }

    public static class BoolLiteralExpressionNode extends LiteralExpressionNode {
        private boolean value = false;

        public BoolLiteralExpressionNode(boolean value) {
            this.value = value;
        }

        public boolean isValue() {
            return value;
        }

        public void setValue(boolean value) {
            this.value = value;
        }

        @Override
        public List<ASTNode> getChildren() {
            return new ArrayList<>();
        }

        @Override
        public void accept(BaseAstVisitor visitor) {
            visitor.visit(this);
        }

        @Override
        public String toString() {
            return "BoolLiteralExpressionNode{" +
                    "value=" + value +
                    '}';
        }
    }
}
