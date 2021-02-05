package ast;

import visitors.AstVisitor;

import java.util.List;

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

    @Override
    public List<ASTNode> getChildren() {
        return null;
    }

    @Override
    public void accept(AstVisitor visitor) {

    }
}
