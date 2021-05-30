package errors.variable;

import errors.SimplyError;

public record DuplicateVariableDeclarationError(String variableName) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Variable " + this.variableName + " have already declared";
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
