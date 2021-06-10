package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.Objects;

public final class InvalidMultiplicationOperationError implements SimplyError {
    private final DataType left;
    private final DataType right;

    public InvalidMultiplicationOperationError(DataType left,
                                               DataType right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Can't multiply " + this.left + " by " + this.right;
    }

    @Override
    public String getErrorType() {
        return "ArithmeticError:InvalidMultiplicationError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }

    public DataType left() {
        return left;
    }

    public DataType right() {
        return right;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (InvalidMultiplicationOperationError) obj;
        return Objects.equals(this.left, that.left) &&
                Objects.equals(this.right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return "InvalidMultiplicationOperationError[" +
                "left=" + left + ", " +
                "right=" + right + ']';
    }

}


