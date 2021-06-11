package passes.semantic;

import ast.util.enums.DataType;

public final class SymbolDataType {
    private final DataType dataType;
    private final boolean isList;

    public SymbolDataType(DataType dataType, boolean isList) {
        this.dataType = dataType;
        this.isList = isList;
    }

    public DataType dataType() {
        return dataType;
    }

    public boolean isList() {
        return isList;
    }

}
