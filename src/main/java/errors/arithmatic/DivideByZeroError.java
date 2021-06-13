package errors.arithmatic;

import errors.SimplyError;

public class DivideByZeroError implements SimplyError {
    @Override
    public String getErrorMessage() {
        return "Error: " +
                this.getErrorType() + "\n\n" +
                this.getErrorDescription();
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:DivideByZeroError";
    }

    @Override
    public String getErrorDescription() {
        return "You have divided something by zero. You can’t do that in programming or mathematics!";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
