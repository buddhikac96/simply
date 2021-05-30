package ast.util.enums;

import com.fasterxml.jackson.annotation.JsonAlias;

public enum  DataType {
    @JsonAlias({"int"}) IntegerType("integer"),
    @JsonAlias({"float"}) FloatType("float"),
    @JsonAlias({"boolean"}) BooleanType("boolean"),
    @JsonAlias({"char"}) CharType("char"),
    @JsonAlias({"String", "string"}) StringType("string"),
    @JsonAlias({"void"}) VoidType("void");

    private final String datatype;

    DataType(String datatype) {
        this.datatype = datatype;
    }

    public String getDatatype(){
        return this.datatype;
    }
}
