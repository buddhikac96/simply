package errors.library;

import errors.SimplyError;

import java.util.Objects;

public final class UndefinedLibraryImportError implements SimplyError {
    private final String libName;

    public UndefinedLibraryImportError(String libName) {
        this.libName = libName;
    }

    @Override
    public String getErrorMessage() {

        return "Error:" +
                this.getErrorType() + "\n\n" +
                this.getErrorDescription();
    }

    @Override
    public String getErrorType() {
        return "LibraryError:" + this.getClass().getName();
    }

    @Override
    public String getErrorDescription() {
        return "We don’t have a library called " + this.libName + ". We only have 3 standard libraries: mathematics, strings, and keyboardIn.";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }

    public String libName() {
        return libName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (UndefinedLibraryImportError) obj;
        return Objects.equals(this.libName, that.libName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libName);
    }

    @Override
    public String toString() {
        return "UndefinedLibraryImportError[" +
                "libName=" + libName + ']';
    }

}
