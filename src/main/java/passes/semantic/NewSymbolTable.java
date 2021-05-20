package passes.semantic;

import ast.util.enums.DataType;

import java.util.HashMap;

public class NewSymbolTable {
    HashMap<String, SimplyVariable> map;

    public NewSymbolTable() {
        this.map = new HashMap<>();
    }
}

