package ast;

import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrimitiveVariableDeclarationNode extends VariableDeclarationNode {
    boolean isConst;
    DataType dataType;
    String varName;
    ExpressionNode value;

    public PrimitiveVariableDeclarationNode(
            boolean isConst,
            DataType dataType,
            String varName,
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
    public String getName() {
        return this.varName;
    }

    @Override
    public List<ASTNode> getChildren() {
        List<ASTNode> children = new ArrayList<>();
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
