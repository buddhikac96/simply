package errors.library;

import errors.SimplyError;

public record UndefinedLibraryImportError(String libName) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Library " + this.libName + " not defined";
    }

    @Override
    public String getErrorType() {
        return "LibraryError:" + this.getClass().getName();
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
