package universalJavaPortal;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

public class Message {
    String libName;
    String funcName;
    DataType returnType;
    List<DataType> params = new ArrayList<>();

    public Message setLibName(String libName) {
        this.libName = libName;
        return this;
    }

    public Message setFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    public Message setReturnType(DataType returnType) {
        this.returnType = returnType;
        return this;
    }

    public Message setParams(List<DataType> params) {
        this.params = params;
        return this;
    }
}
