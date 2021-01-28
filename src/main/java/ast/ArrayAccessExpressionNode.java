package ast;

public class ArrayAccessExpressionNode extends ExpressionNode {
    private String arrayName;
    private ExpressionNode accessValueExpression;

    public ArrayAccessExpressionNode(String arrayName, ExpressionNode accessValueExpression) {
        this.arrayName = arrayName;
        this.accessValueExpression = accessValueExpression;
    }

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public ExpressionNode getAccessValueExpression() {
        return accessValueExpression;
    }

    public void setAccessValueExpression(ExpressionNode accessValueExpression) {
        this.accessValueExpression = accessValueExpression;
    }
}
