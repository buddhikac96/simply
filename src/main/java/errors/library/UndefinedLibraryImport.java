package errors.library;

public class UndefinedLibraryImport extends LibrarySimplyError {

    private String libName;
    private int lineNumber;

    public UndefinedLibraryImport(String libName, int lineNumber) {
        this.libName = libName;
        this.lineNumber = lineNumber;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType());
        message.append("in line:" + getLineNumber() + "\n");
        message.append("Library " + this.libName + " node defined");

        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "LibraryError: UndefinedLibraryImportError";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
