package errors.library;

import errors.SimplyError;

public class DuplicateLibraryImportSimplyError implements SimplyError {

    private String libName;

    public DuplicateLibraryImportSimplyError(String libName) {
        this.libName = libName;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Library " + this.libName + " have already imported");

        return message.toString();
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
