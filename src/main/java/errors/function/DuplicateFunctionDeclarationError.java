package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.List;
import java.util.StringJoiner;

public class DuplicateFunctionDeclarationError implements SimplyError {
    String libName;
    String funcName;
    List<DataType> args;

    public DuplicateFunctionDeclarationError(String libName, String funcName, List<DataType> args) {
        this.libName = libName;
        this.funcName = funcName;
        this.args = args;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");

        var sj = new StringJoiner(",", "(", ")");
        args.forEach(i -> sj.add(i.getDatatype()));

        message.append("Function " + this.funcName + sj.toString() + " have already declared in package " + this.libName);
        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "FunctionError:DuplicateFunctionDeclarationError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
