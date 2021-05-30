package app.bootstrap;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
    LibResource class
 */
public class LibResourceModal {

    public final HashMap<String, Library> libraries;

    public LibResourceModal() {
        this.libraries = new HashMap<>();
    }

    public void addLibrary(Library library){
        this.libraries.put(library.alias, library);
    }

    /*
        Library class
    */
    public static class Library{
        public final String jname;
        public final String alias;
        public final HashMap<String, Function> functionList;

        public Library(String jname, String alias) {
            this.jname = jname;
            this.alias = alias;
            this.functionList = new HashMap<>();
        }

        public void addFunction(Function function){
            this.functionList.put(function.alias, function);
        }

    }


    /*
        Function class
     */
    public static class Function{
        public final String jname;
        public final String alias;
        public final List<Overload> overloadList;

        public Function(String jname, String alias) {
            this.jname = jname;
            this.alias = alias;
            this.overloadList = new ArrayList<>();
        }

        public void addOverload(Overload overload){
            this.overloadList.add(overload);
        }
    }


    /*
        Overload class
     */
    public static class Overload{
        public final List<DataType> argList;
        public final DataType returnType;

        public Overload(DataType returnType) {
            this.argList = new ArrayList<>();
            this.returnType = returnType;
        }

        public void addArg(DataType dataType){
            this.argList.add(dataType);
        }
    }
}

