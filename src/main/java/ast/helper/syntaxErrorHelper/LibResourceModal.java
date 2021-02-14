package ast.helper.syntaxErrorHelper;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

/*
    LibResource class
 */
public class LibResourceModal {

    public List<Library> libraryList;

    public LibResourceModal() {
        this.libraryList = new ArrayList<>();
    }

    public void addLibrary(Library library){
        this.libraryList.add(library);
    }

    /*
        Library class
    */
    public static class Library{
        public String jname;
        public String alias;
        public List<Function> functionList;

        public Library(String jname, String alias) {
            this.jname = jname;
            this.alias = alias;
            this.functionList = new ArrayList<>();
        }

        public void addFunction(Function function){
            this.functionList.add(function);
        }
    }


    /*
        Function class
     */
    public static class Function{
        public String jname;
        public String alias;
        public List<Overload> overloadList;

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
        public List<DataType> argList;
        public DataType returnType;

        public Overload(DataType returnType) {
            this.argList = new ArrayList<>();
            this.returnType = returnType;
        }

        public void addArg(DataType dataType){
            this.argList.add(dataType);
        }
    }
}

