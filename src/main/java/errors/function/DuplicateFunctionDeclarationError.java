package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.List;
import java.util.StringJoiner;

public record DuplicateFunctionDeclarationError(String libName, String funcName,
                                                List<DataType> args) implements SimplyError {

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");

        var sj = new StringJoiner(",", "(", ")");
        args.forEach(i -> sj.add(i.getDatatype()));

        message.append("Function ").append(this.funcName).append(sj.toString()).append(" have already declared in package ").append(this.libName);
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
