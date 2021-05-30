package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public record InvalidDivisionOperationError(DataType left,
                                            DataType right) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Can't divide " + this.left + " by " + this.right;
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
