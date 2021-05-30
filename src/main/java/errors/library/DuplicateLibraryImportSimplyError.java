package errors.library;

import errors.SimplyError;

public record DuplicateLibraryImportSimplyError(String libName) implements SimplyError {

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n" +
                "Library " + this.libName + " have already imported";
    }

    @Override
    public String getErrorType() {
        return "LibraryError: DuplicateLibraryImportError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }

}
