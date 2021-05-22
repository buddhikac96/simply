package universalJavaMapper;

import ast.util.enums.DataType;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class JavaLibrary {
    public String name;
    public String alias;
    public List<JavaFunction> functions;

    public static class JavaFunction{
        public String name;
        public String alias;
        public List<JavaFunctionOverload> overloads;

    }

    public static class JavaFunctionOverload{
        @JsonAlias({"return"})
        public DataType returnType;
        public List<DataType> params;
    }
}




