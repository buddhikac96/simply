package passes.transpiler;

import java.util.HashMap;

public class StandardLibraryMapper {
    private static final HashMap<String, String> javaLibraryMapper;
    private static final HashMap<String, String> javaLibraryFunctionMapper;

    static{
        javaLibraryMapper = new HashMap<>();
        javaLibraryMapper.put("mathematics", "java.lang.Math");
        javaLibraryMapper.put("keyboardIn", "java.util.Scanner");
        javaLibraryMapper.put("strings", "java.lang.String");
    }

    static{
        javaLibraryFunctionMapper = new HashMap<>();
        javaLibraryFunctionMapper.put("getLength", "length");
        javaLibraryFunctionMapper.put("combine", "concat");
        javaLibraryFunctionMapper.put("isEmpty", "isEmpty");
        javaLibraryFunctionMapper.put("toCapital", "toUpperCase");
        javaLibraryFunctionMapper.put("toSimple", "toLowerCase");
        javaLibraryFunctionMapper.put("absolute", "abs");
        javaLibraryFunctionMapper.put("squareRoot", "sqrt");
        javaLibraryFunctionMapper.put("power", "pow");
        javaLibraryFunctionMapper.put("roundUp", "ceil");
        javaLibraryFunctionMapper.put("roundDown", "floor");
    }


    public static String getJavaLibraryImport(String simplyLibrary){
        return javaLibraryMapper.get(simplyLibrary);
    }

    public static String getJavaLibraryFunction(String simplyFunction){
        return javaLibraryFunctionMapper.get(simplyFunction);
    }

}
