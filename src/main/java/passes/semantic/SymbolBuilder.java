package passes.semantic;

import ast.util.enums.DataType;

public class SymbolBuilder {
    String name;
    DataType dataType;
    boolean isConst;
    boolean isArray;
    boolean isInit;

    public SymbolBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SymbolBuilder setDataType(DataType dataType) {
        this.dataType = dataType;
        return this;
    }

    public SymbolBuilder setConst(boolean aConst) {
        isConst = aConst;
        return this;
    }

    public SymbolBuilder setArray(boolean array) {
        isArray = array;
        return this;
    }

    public SymbolBuilder setInit(boolean init) {
        isInit = init;
        return this;
    }

    public Symbol build() {
        return new Symbol(
                this.name,
                this.dataType,
                this.isConst,
                this.isArray,
                this.isInit
        );
    }
}
