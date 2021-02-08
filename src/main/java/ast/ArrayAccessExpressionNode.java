package ast;

import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        List<ASTNode> children = new ArrayList<>();
        children.add(accessValueExpression);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
    }
}
