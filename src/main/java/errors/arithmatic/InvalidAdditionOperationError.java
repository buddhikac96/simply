package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public record InvalidAdditionOperationError(DataType left,
                                            DataType right) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Can't add " + this.left + " with " + this.right;
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:InvalidAdditionOperationError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
