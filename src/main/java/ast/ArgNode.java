package ast;

import ast.util.enums.DataType;
import visitors.BaseAstVisitor;

import java.util.ArrayList;
import java.util.List;

public class ArgNode extends ASTNode {
    private DataType dataType;
    private String name;

    public ArgNode(DataType dataType, String name) {
        this.dataType = dataType;
        this.name = name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "ArgNode{" +
                "dataType=" + dataType +
                ", name='" + name + '\'' +
                '}';
    }
}

