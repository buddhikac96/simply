package errors.library;

public class DuplicateLibraryImportSimplyError extends LibrarySimplyError {

    private String libName;
    private int lineNumber;
    private int oldLibLineNumber;

    public DuplicateLibraryImportSimplyError(String libName, int lineNumber) {
        this.libName = libName;
        this.lineNumber = lineNumber;
    }

    public DuplicateLibraryImportSimplyError(String libName, int lineNumber, int oldLibLineNumber) {
        this.libName = libName;
        this.lineNumber = lineNumber;
        this.oldLibLineNumber = oldLibLineNumber;
    }

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType());
        message.append("in line:" + getLineNumber() + "\n");
        message.append("Library " + this.libName + " have already imported");

        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "LibraryError: DuplicateLibraryImportError";
    }

    @Override
    public int getLineNumber() {
        return this.lineNumber;
    }
}
