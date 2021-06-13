package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.Objects;

public final class ReturnTypeMisMatchError implements SimplyError {
    private final DataType expected;
    private final DataType actual;

    public ReturnTypeMisMatchError(DataType expected,
                                   DataType actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Expected: " + this.expected.getDatatype() + "\n" +
                "Provided: " + this.actual.getDatatype() + "\n\n" +
                this.getErrorDescription();
    }

    @Override
    public String getErrorType() {
        return "FunctionError:" + this.getClass().getName();
    }

    @Override
    public String getErrorDescription() {
        return "Your function's output data type is " + this.expected + ". But you have mistakenly returned " + this.actual + " in the return statement.";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }

    public DataType expected() {
        return expected;
    }

    public DataType actual() {
        return actual;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (ReturnTypeMisMatchError) obj;
        return Objects.equals(this.expected, that.expected) &&
                Objects.equals(this.actual, that.actual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expected, actual);
    }

    @Override
    public String toString() {
        return "ReturnTypeMisMatchError[" +
                "expected=" + expected + ", " +
                "actual=" + actual + ']';
    }

}
