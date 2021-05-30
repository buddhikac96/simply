package universalJavaPortal;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

public class SimplyFunctionModel {
    private String libName;
    private String funcName;
    private DataType returnType;
    private final List<DataType> params;

    public SimplyFunctionModel() {
        this.params = new ArrayList<>();
    }

    private SimplyFunctionModel(String libName, String funcName, DataType returnType, List<DataType> params) {
        this.libName = libName;
        this.funcName = funcName;
        this.returnType = returnType;
        this.params = params;
    }

    public SimplyFunctionModel addParam(DataType dt){
        this.params.add(dt);
        return this;
    }

    public SimplyFunctionModel setLibName(String libName) {
        this.libName = libName;
        return this;
    }

    public SimplyFunctionModel setFuncName(String funcName) {
        this.funcName = funcName;
        return this;
    }

    public SimplyFunctionModel setReturnType(DataType returnType) {
        this.returnType = returnType;
        return this;
    }

    public SimplyFunctionModel Build(){
        return new SimplyFunctionModel(libName, funcName, returnType, params);
    }

    public String getLibName() {
        return libName;
    }

    public String getFuncName() {
        return funcName;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public List<DataType> getParams() {
        return params;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SimplyFunctionModel sfm){
            return libName.equals(sfm.getLibName())
                    && funcName.equals(sfm.getFuncName())
                    && params.equals(sfm.getParams());

        }

        return false;
    }
}

