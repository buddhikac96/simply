package errors.variable;

import ast.util.enums.DataType;
import errors.SimplyError;

public class TypeMisMatchError implements SimplyError {

    private DataType requiredType;
    private DataType originalType;

    public TypeMisMatchError(DataType requiredType, DataType originalType) {
        this.requiredType = requiredType;
        this.originalType = originalType;
    }

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
