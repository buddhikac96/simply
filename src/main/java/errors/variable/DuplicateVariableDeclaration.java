package errors.variable;

import errors.SimplyError;

public class DuplicateVariableDeclaration implements SimplyError {

    private String variableName;

    public DuplicateVariableDeclaration(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType());
        message.append("in line:" + getLineNumber() + "\n");
        message.append("Variable " + this.variableName + " have already declared");

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
