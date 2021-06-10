package errors.variable;

import ast.util.enums.DataType;
import errors.SimplyError;

import java.util.Objects;

public final class TypeMisMatchError implements SimplyError {
    private final DataType requiredType;
    private final DataType originalType;

    public TypeMisMatchError(DataType requiredType,
                             DataType originalType) {
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

    public DataType requiredType() {
        return requiredType;
    }

    public DataType originalType() {
        return originalType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (TypeMisMatchError) obj;
        return Objects.equals(this.requiredType, that.requiredType) &&
                Objects.equals(this.originalType, that.originalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredType, originalType);
    }

    @Override
    public String toString() {
        return "TypeMisMatchError[" +
                "requiredType=" + requiredType + ", " +
                "originalType=" + originalType + ']';
    }

}
