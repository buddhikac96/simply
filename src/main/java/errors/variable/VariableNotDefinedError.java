package errors.variable;

import errors.SimplyError;

import java.util.Objects;

public final class VariableNotDefinedError implements SimplyError {
    private final String varName;

    public VariableNotDefinedError(String varName) {
        this.varName = varName;
    }

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + " " + "\n" +
                "Variable " + this.varName + " not defined";
    }

    @Override
    public String getErrorType() {
        return "Variable:VariableNotDefinedError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }

    public String varName() {
        return varName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (VariableNotDefinedError) obj;
        return Objects.equals(this.varName, that.varName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varName);
    }

    @Override
    public String toString() {
        return "VariableNotDefinedError[" +
                "varName=" + varName + ']';
    }

}
