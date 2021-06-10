package passes.semantic;

import ast.util.enums.DataType;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (SymbolDataType) obj;
        return Objects.equals(this.dataType, that.dataType) &&
                this.isList == that.isList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, isList);
    }

    @Override
    public String toString() {
        return "SymbolDataType[" +
                "dataType=" + dataType + ", " +
                "isList=" + isList + ']';
    }

}
