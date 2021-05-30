package passes.semantic;

import java.util.HashMap;

public class NewSymbolTable {
    final HashMap<String, SimplyVariable> map;

    public NewSymbolTable() {
        this.map = new HashMap<>();
    }
}

