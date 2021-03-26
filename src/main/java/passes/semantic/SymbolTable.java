package passes.semantic;

import java.util.HashMap;

public class SymbolTable {
    HashMap<String, Symbol> map;
    SymbolTable symbolTable;

    public SymbolTable() {
        this.map = new HashMap<>();
    }

    boolean add(Symbol symbol){
        if(this.symbolTable == null){
            if(map.containsKey(symbol.name)){
                return false;
            }else{
                map.put(symbol.name, symbol);
                return true;
            }
        }else{
            return this.symbolTable.add(symbol);
        }
    }

    void empty(){
        var table = this.symbolTable;
        while(table != null){
            table = table.symbolTable;
        }

        table = null;
    }


}