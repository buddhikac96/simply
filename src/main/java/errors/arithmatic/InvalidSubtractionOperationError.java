package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public record InvalidSubtractionOperationError(DataType left,
                                               DataType right) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Can't subtract " + this.right + " from " + this.left;
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:InvalidSubtractionOperationError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}

