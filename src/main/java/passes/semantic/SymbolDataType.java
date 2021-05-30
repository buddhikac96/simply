package passes.semantic;

import ast.util.enums.DataType;

public record SymbolDataType(DataType dataType, boolean isList) {
}
