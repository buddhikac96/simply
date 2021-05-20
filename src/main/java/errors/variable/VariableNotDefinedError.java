package errors.variable;

import errors.SimplyError;

public class VariableNotDefinedError implements SimplyError {

    String varName;

    public VariableNotDefinedError(String varName) {
        this.varName = varName;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType() + " ");
        message.append("in line: " + getLineNumber() + "\n");
        message.append("Variable " + this.varName + " not defined");

        return message.toString();
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
