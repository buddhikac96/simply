package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public class InvalidMultiplicationOperationError implements SimplyError {

    private DataType left;
    private DataType right;

    public InvalidMultiplicationOperationError(DataType left, DataType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType() + "\n");
        message.append("Can't multiply " + this.left + " by " + this.right);

        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:InvalidMultiplicationError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}


