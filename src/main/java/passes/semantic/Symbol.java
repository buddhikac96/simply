package passes.semantic;

import ast.util.enums.DataType;

public class Symbol {
    String name;
    DataType dataType;
    boolean isConst;
    boolean isArray;
    boolean isInit;

    public Symbol() {
    }

    public Symbol(String name, DataType dataType, boolean isConst, boolean isArray, boolean isInit) {
        this.name = name;
        this.dataType = dataType;
        this.isConst = isConst;
        this.isArray = isArray;
        this.isInit = isInit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public void setInit(boolean init) {
        isInit = init;
    }
}

