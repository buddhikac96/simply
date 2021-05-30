package errors.arithmatic;

import errors.SimplyError;

public class DivideByZeroError implements SimplyError {
    @Override
    public String getErrorMessage() {
        return "Error: Divisor can't be zero (0)";
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
