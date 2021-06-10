package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public final class DuplicateFunctionDeclarationError implements SimplyError {
    private final String libName;
    private final String funcName;
    private final List<DataType> args;

    public DuplicateFunctionDeclarationError(String libName, String funcName,
                                             List<DataType> args) {
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

    public String libName() {
        return libName;
    }

    public String funcName() {
        return funcName;
    }

    public List<DataType> args() {
        return args;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DuplicateFunctionDeclarationError) obj;
        return Objects.equals(this.libName, that.libName) &&
                Objects.equals(this.funcName, that.funcName) &&
                Objects.equals(this.args, that.args);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libName, funcName, args);
    }

    @Override
    public String toString() {
        return "DuplicateFunctionDeclarationError[" +
                "libName=" + libName + ", " +
                "funcName=" + funcName + ", " +
                "args=" + args + ']';
    }

}
