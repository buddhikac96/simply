package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public class InvalidDivisionOperationError implements SimplyError {

    private final DataType left;
    private final DataType right;

    public InvalidDivisionOperationError(DataType left, DataType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Can't divide ").append(this.left).append(" by ").append(this.right);

        return message.toString();
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
