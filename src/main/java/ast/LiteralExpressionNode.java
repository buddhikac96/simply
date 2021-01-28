package ast;

public abstract class LiteralExpressionNode extends ExpressionNode {
    public static class IntegerLiteralExpression extends LiteralExpressionNode {
        private int value;

        public IntegerLiteralExpression(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static class FloatLiteralExpression extends LiteralExpressionNode {
        private float value;

        public FloatLiteralExpression(float value) {
            this.value = value;
        }

        public float getValue() {
            return value;
        }

        public void setValue(float value) {
            this.value = value;
        }
    }

    public static class CharLiteralExpression extends LiteralExpressionNode {
        private char value;

        public CharLiteralExpression(char value) {
            this.value = value;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }
    }

    public static class StringLiteralExpression extends LiteralExpressionNode {
        private String value;

        public StringLiteralExpression(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class BoolLiteralExpression extends LiteralExpressionNode {
        private boolean value = false;

        public BoolLiteralExpression(boolean value) {
            this.value = value;
        }

        public boolean isValue() {
            return value;
        }

        public void setValue(boolean value) {
            this.value = value;
        }
    }
}
