package ast;

import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimitiveVariableDeclarationNode extends VariableDeclarationNode {
    boolean isConst;
    final DataType dataType;
    final IdentifierNode varName;
    final ExpressionNode value;

    public PrimitiveVariableDeclarationNode(
            boolean isConst,
            DataType dataType,
            IdentifierNode varName,
            ExpressionNode value
    ) {
        this.isConst = isConst;
        this.dataType = dataType;
        this.varName = varName;
        this.value = value;
    }

    @Override
    public void setConst() {
        this.isConst = true;
    }

    @Override
    public IdentifierNode getName() {
        return this.varName;
    }

    public boolean isConst() {
        return isConst;
    }

    public DataType getDataType() {
        return dataType;
    }

    public ExpressionNode getValue() {
        return value;
    }

    public boolean isInit(){
        return this.value != null;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
        children.add(this.varName);
        children.add(this.value);
        return children;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {
        this.getChildren().stream().filter(Objects::nonNull).forEach(node -> node.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "PrimitiveVariableDeclarationNode{" +
                "isConst=" + isConst +
                ", dataType=" + dataType +
                ", varName='" + varName + '\'' +
                ", value=" + value +
                '}';
    }
}
