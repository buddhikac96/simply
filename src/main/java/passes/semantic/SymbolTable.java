package passes.semantic;

import java.util.HashMap;

public class SymbolTable {
    final HashMap<String, SimplyVariable> map;

    public SymbolTable() {
        this.map = new HashMap<>();
    }
}

