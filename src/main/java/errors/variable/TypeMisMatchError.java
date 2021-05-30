package errors.variable;

import ast.util.enums.DataType;
import errors.SimplyError;

public record TypeMisMatchError(DataType requiredType,
                                DataType originalType) implements SimplyError {

    @Override
    public String getErrorMessage() {


        return "Error:" +
                this.getErrorType() + "\n" +
                "Required: " + this.requiredType + "\n" +
                "Provided: " + this.originalType;
    }

    @Override
    public String getErrorType() {
        return "VariableError:DataTypeMisMatchError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
