package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.List;
import java.util.StringJoiner;

public class FunctionNotDeclared implements SimplyError {

    private String functionName;
    private List<DataType> params;

    public FunctionNotDeclared(String functionName, List<DataType> params) {
        this.functionName = functionName;
        this.params = params;
    }

    @Override
    public String getErrorMessage() {
        var prefix = functionName + "(";
        var sj = new StringJoiner(",", prefix, ")");
        params.forEach(p -> sj.add(p.getDatatype()));
        return "Function " + sj.toString() + " not declared";
    }

    @Override
    public String getErrorType() {
        return null;
    }

    @Override
    public String getErrorDescription() {
        return null;
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
