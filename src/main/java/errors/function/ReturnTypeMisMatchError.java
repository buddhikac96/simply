package errors.function;

import ast.util.enums.DataType;
import errors.SimplyError;

public class ReturnTypeMisMatchError implements SimplyError {

    private final DataType expected;
    private final DataType actual;

    public ReturnTypeMisMatchError(DataType expected, DataType actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Expected: ").append(this.expected.getDatatype()).append("\n");
        message.append("Provided: ").append(this.actual.getDatatype());

        return message.toString();
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
