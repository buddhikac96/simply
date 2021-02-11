package ast.error;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.List;

/*
    LibResource class
 */
public class LibResourceModal {
    List<Lib> libList;

    public LibResourceModal() {
        this.libList = new ArrayList<>();
    }

    public void addLib(Lib lib){
        this.libList.add(lib);
    }


    /*
        Library class
     */
    public static class Lib{
        String libName;
        List<LibFunc> libFuncList;

        public Lib(String libName) {
            this.libName = libName;
            this.libFuncList = new ArrayList<>();
        }

        public void addLibFunc(LibFunc libFunc){
            this.libFuncList.add(libFunc);
        }
    }

    /*
        Library Function Class
     */
    public static class LibFunc{
        String name;
        DataType returnType;
        List<FuncArg> funcArgList;

        public LibFunc(String name, DataType returnType) {
            this.name = name;
            this.returnType = returnType;
            this.funcArgList = new ArrayList<>();
        }

        public void addFuncArg(FuncArg funcArg){
            this.funcArgList.add(funcArg);
        }
    }


    /*
        Function Argument Class
     */
    public static class FuncArg{
        DataType dataType;

        public FuncArg(DataType dataType) {
            this.dataType = dataType;
        }
    }
}

