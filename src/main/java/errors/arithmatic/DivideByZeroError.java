package errors.arithmatic;

import errors.SimplyError;

public class DivideByZeroError implements SimplyError {
    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append("Divisor can't be zero (0)");

        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError: DivideByZeroError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
