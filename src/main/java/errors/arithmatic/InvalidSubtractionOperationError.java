package errors.arithmatic;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.Objects;

public final class InvalidSubtractionOperationError implements SimplyError {
    private final DataType left;
    private final DataType right;

    public InvalidSubtractionOperationError(DataType left,
                                            DataType right) {
        this.left = left;
        this.right = right;
    }

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
        var that = (InvalidSubtractionOperationError) obj;
        return Objects.equals(this.left, that.left) &&
                Objects.equals(this.right, that.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }

    @Override
    public String toString() {
        return "InvalidSubtractionOperationError[" +
                "left=" + left + ", " +
                "right=" + right + ']';
    }

}

