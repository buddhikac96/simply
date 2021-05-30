package errors.variable;

import errors.SimplyError;

public class DuplicateVariableDeclarationError implements SimplyError {

    private final String variableName;

    public DuplicateVariableDeclarationError(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Variable ").append(this.variableName).append(" have already declared");

        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "VariableError: DuplicateVariableDeclarationError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
