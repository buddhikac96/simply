package errors.arithmatic;

import errors.SimplyError;

public class InvalidModulusOperationError implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Modulus operation should be Integer % Integer";
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
