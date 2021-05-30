package errors.arithmatic;

import errors.SimplyError;

public class InvalidModulusOperationError implements SimplyError {

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Modulus operation should be Integer % Integer");

        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:InvalidDivisionError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
