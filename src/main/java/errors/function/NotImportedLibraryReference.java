package errors.function;

import errors.SimplyError;

public record NotImportedLibraryReference(String libName) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Library " + this.libName + " is not imported";
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
