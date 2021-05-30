package errors.function;

import errors.SimplyError;

public class NotImportedLibraryReference implements SimplyError {

    final String libName;

    public NotImportedLibraryReference(String libName) {
        this.libName = libName;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("Library ").append(this.libName).append(" is not imported");

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
