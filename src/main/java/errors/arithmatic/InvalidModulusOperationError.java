package errors.arithmatic;

import errors.SimplyError;

public class InvalidModulusOperationError implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n\n" +
                this.getErrorDescription();
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:InvalidModulusOperationError";
    }

    @Override
    public String getErrorDescription() {
        return "You have tried to give a wrong data type to the Modulus operation (%). You can only use integers for this!";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
