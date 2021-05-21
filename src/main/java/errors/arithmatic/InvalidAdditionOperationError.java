package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public class InvalidAdditionOperationError implements SimplyError {

    private DataType left;
    private DataType right;

    public InvalidAdditionOperationError(DataType left, DataType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType() + "\n");
        message.append("Can't add " + this.left + " with " + this.right);

        return message.toString();
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
