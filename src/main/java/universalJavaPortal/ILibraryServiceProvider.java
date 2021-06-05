package universalJavaPortal;

import ast.util.enums.DataType;

public interface ILibraryServiceProvider {
    ////////// library

    boolean isValidLibrary(Message message); // lib name

    boolean isValidFuncCall(Message message); // lib name, func name, param

    DataType getReturnType(Message message); // lib name, func name, param

    boolean isFunctionExist(Message message); // lib name = simply, func name, return type, params

    String getJavaLibName(String simplyLibName);

    String getFuncCall(Message message); //lib name, func name, param

}
