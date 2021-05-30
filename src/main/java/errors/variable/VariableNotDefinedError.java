package errors.variable;

import errors.SimplyError;

public record VariableNotDefinedError(String varName) implements SimplyError {

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
}
