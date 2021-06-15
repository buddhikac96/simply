package passes.transpiler;

import ast.util.enums.DataType;

import java.util.HashMap;

public class JavaUserInputMapper {
    private static final HashMap<DataType, String> javaUserInputMethodMapper;

    static{
        javaUserInputMethodMapper = new HashMap<>();
        javaUserInputMethodMapper.put(DataType.IntegerType, "nextInt()");
        javaUserInputMethodMapper.put(DataType.FloatType, "nextDouble()");
        javaUserInputMethodMapper.put(DataType.BooleanType, "nextBoolean()");
        javaUserInputMethodMapper.put(DataType.StringType, "nextLine()");
        javaUserInputMethodMapper.put(DataType.CharType, "next().charAt(0)");
    }

    public static String getScannerClassMethod(DataType inputDataType){
        return javaUserInputMethodMapper.get(inputDataType);
    }
}