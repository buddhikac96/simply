package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

public class InvalidDivisionError implements SimplyError {

    private DataType left;
    private DataType right;

    public InvalidDivisionError(DataType left, DataType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType() + "\n");
        message.append("Can't divide " + this.left + " by " + this.right);

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
