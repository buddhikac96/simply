package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public class InvalidSubtractionOperationError implements SimplyError {
    private DataType left;
    private DataType right;

    public InvalidSubtractionOperationError(DataType left, DataType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType() + "\n");
        message.append("Can't subtract " + this.right + " from " + this.left);

        return message.toString();
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

