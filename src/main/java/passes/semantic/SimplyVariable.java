package passes.semantic;

import ast.util.enums.DataType;

public class SimplyVariable {
    private final String name;
    private DataType type;
    private boolean isList;

    public SimplyVariable(String name) {
        this.name = name;
    }

    public SimplyVariable(String name, DataType type) {
        this.name = name;
        this.type = type;
    }

    public SimplyVariable(String name, DataType type, boolean isList) {
        this.name = name;
        this.type = type;
        this.isList = isList;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public boolean isList() {
        return isList;
    }
}
