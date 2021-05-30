package universalJavaMapper;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

public class FunctionHashStringBuilder {
    String libName;
    String funcName;
    DataType returnType;
    final List<DataType> params;

    public FunctionHashStringBuilder() {
        this.params = new ArrayList<>();
    }

    public FunctionHashStringBuilder setLibName(String libName) {
        this.libName = libName;
        return this;
    }

    public FunctionHashStringBuilder setFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    public FunctionHashStringBuilder setReturnType(DataType returnType) {
        this.returnType = returnType;
        return this;
    }

    public FunctionHashStringBuilder addParam(DataType param) {
        this.params.add(param);
        return this;
    }

    public String Build() {
        var sb = new StringBuilder();
        sb.append("lib:").append(libName).append(";");
        sb.append("func:").append(funcName).append(";");
        sb.append("params:");
        for (var dt : params) {
            sb.append(dt.getDatatype()).append(",");
        }

        return sb.toString();
    }
}
