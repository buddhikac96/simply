package ast.helper.syntaxErrorHelper;

import ast.util.enums.DataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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

    public HashSet<String> getLibAliasNames(){
        HashSet<String> set = new HashSet<>();
        this.libraryList.forEach(lib -> set.add(lib.alias));
        return set;
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

        public HashSet<String> getFunctionAliasNames(){
            HashSet<String> set = new HashSet<>();
            this.functionList.forEach(func -> set.add(func.alias));
            return set;
        }

        /*
            TODO : return overload as a single string and check overload in syntax analyzing section
            ex: foo(int a, float b) -> foointfloat -> check this string
         */

        public HashSet<String> getFunctionOverloadList(){
            HashSet<String> set = new HashSet<>();

            for (Function func : functionList) {
                for (Overload overload : func.overloadList) {
                    StringBuilder name = new StringBuilder();
                    name.append(func.alias);
                    for (DataType arg : overload.argList) {
                        name.append(arg.name());
                    }
                    set.add(name.toString());
                    name = new StringBuilder();
                }
            }

            return set;
        }

        public HashMap<String, HashSet<Integer>> getFunctionOverloadArgDetailList(){
            HashMap<String, HashSet<Integer>> map = new HashMap<>();

            for(Function func : functionList) {
                String name = func.alias;
                map.put(name, new HashSet<>());
                for (Overload overload : func.overloadList) {
                    int numOfArgs = overload.argList.size();
                    map.get(name).add(numOfArgs);
                }
            }

            for(String key : map.keySet()){
                System.out.print(key + " - ");
                map.get(key).forEach(num -> {
                    System.out.print(num + ", ");
                });
                System.out.println();
            }
            return map;
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

