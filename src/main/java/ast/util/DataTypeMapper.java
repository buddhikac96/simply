package ast.util;

import ast.util.enums.DataType;

import java.util.HashMap;

public class DataTypeMapper {
    private static HashMap<String, DataType> dataTypeMap;

    static{
        dataTypeMap = new HashMap<>();
        dataTypeMap.put("int", DataType.StringType);
        dataTypeMap.put("float", DataType.StringType);
        dataTypeMap.put("char", DataType.StringType);
        dataTypeMap.put("string", DataType.StringType);
        dataTypeMap.put("boolean", DataType.StringType);
        dataTypeMap.put("void", DataType.StringType);
    }

    public static DataType getType(String typeName){
        return dataTypeMap.get(typeName);
    }

}
