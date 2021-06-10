package errors.variable;

import errors.SimplyError;

import java.util.Objects;

public final class DuplicateVariableDeclarationError implements SimplyError {
    private final String variableName;

    public DuplicateVariableDeclarationError(String variableName) {
        this.variableName = variableName;
    }

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

    public String variableName() {
        return variableName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DuplicateVariableDeclarationError) obj;
        return Objects.equals(this.variableName, that.variableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variableName);
    }

    @Override
    public String toString() {
        return "DuplicateVariableDeclarationError[" +
                "variableName=" + variableName + ']';
    }

}
