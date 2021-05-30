package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

public record ReturnTypeMisMatchError(DataType expected,
                                      DataType actual) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Expected: " + this.expected.getDatatype() + "\n" +
                "Provided: " + this.actual.getDatatype();
    }

    @Override
    public String getErrorType() {
        return "FunctionError:" + this.getClass().getName();
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
