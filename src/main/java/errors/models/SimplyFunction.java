/*
    Not useful
 */

package errors.models;

import ast.util.enums.DataType;

import java.util.List;

public class SimplyFunction {
    String name;
    DataType returnType;
    List<DataType> args;

    public SimplyFunction(String name, DataType returnType, List<DataType> args) {
        this.name = name;
        this.returnType = returnType;
        this.args = args;
    }

    @Override
    public boolean equals(Object obj) {
        var f = (SimplyFunction) obj;

        if(!f.name.equals(this.name)){
            return false;
        }

        if(f.args.size() != this.args.size()){
            return false;
        }

        for(int i = 0; i < this.args.size(); i++){
            if(this.args.get(i).getDatatype().equals(f.args.get(i).getDatatype())){
                return false;
            }
        }

        return true;
    }
}
