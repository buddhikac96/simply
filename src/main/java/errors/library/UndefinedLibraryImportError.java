package errors.library;

import errors.SimplyError;

public class UndefinedLibraryImportError implements SimplyError {

    private String libName;

    public UndefinedLibraryImportError(String libName) {
        this.libName = libName;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Library " + this.libName + " node defined");

        return message.toString();
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
