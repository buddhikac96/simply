package ast.util;

import ast.util.enums.DataType;

import java.util.HashMap;

public class DataTypeMapper {
    private static final HashMap<String, DataType> dataTypeMap;
    private static final HashMap<DataType, String> javaDataTypeMap;

    static{
        dataTypeMap = new HashMap<>();
        dataTypeMap.put("int", DataType.IntegerType);
        dataTypeMap.put("float", DataType.FloatType);
        dataTypeMap.put("char", DataType.CharType);
        dataTypeMap.put("string", DataType.StringType);
        dataTypeMap.put("boolean", DataType.BooleanType);
        dataTypeMap.put("void", DataType.VoidType);
    }

    static{
        javaDataTypeMap = new HashMap<>();
        javaDataTypeMap.put(DataType.IntegerType, "int");
        javaDataTypeMap.put(DataType.FloatType, "float");
        javaDataTypeMap.put(DataType.CharType, "char");
        javaDataTypeMap.put(DataType.StringType, "String");
        javaDataTypeMap.put(DataType.BooleanType, "boolean");
        javaDataTypeMap.put(DataType.VoidType, "void");
    }



    public static DataType getSimplyTypeClass(String typeName){
        return dataTypeMap.get(typeName);
    }

    public static String getJavaType(DataType dataType){
        return javaDataTypeMap.get(dataType);
    }



}
