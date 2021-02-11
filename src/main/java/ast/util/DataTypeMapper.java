package ast.util;

import ast.util.enums.DataType;

import java.util.HashMap;

public class DataTypeMapper {
    private static HashMap<String, DataType> dataTypeMap;

    static{
        dataTypeMap = new HashMap<>();
        dataTypeMap.put("int", DataType.IntegerType);
        dataTypeMap.put("float", DataType.FloatType);
        dataTypeMap.put("char", DataType.CharType);
        dataTypeMap.put("string", DataType.StringType);
        dataTypeMap.put("boolean", DataType.BooleanType);
        dataTypeMap.put("void", DataType.VoidType);
    }

    public static DataType getType(String typeName){
        return dataTypeMap.get(typeName);
    }

}
