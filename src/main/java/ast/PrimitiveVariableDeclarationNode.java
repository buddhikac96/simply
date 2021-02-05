package ast;

import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.List;

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
        return null;
    }

    @Override
    public void accept(BaseAstVisitor visitor) {

    }
}
