package errors.arithmatic;

import errors.SimplyError;

public class DivideByZeroError implements SimplyError {
    @Override
    public String getErrorMessage() {

        String message = "Error:" +
                "Divisor can't be zero (0)";
        return message;
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
