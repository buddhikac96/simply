package errors.library;

import errors.SimplyError;

import java.util.Objects;

public final class DuplicateLibraryImportSimplyError implements SimplyError {
    private final String libName;

    public DuplicateLibraryImportSimplyError(String libName) {
        this.libName = libName;
    }

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

    public String libName() {
        return libName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DuplicateLibraryImportSimplyError) obj;
        return Objects.equals(this.libName, that.libName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libName);
    }

    @Override
    public String toString() {
        return "DuplicateLibraryImportSimplyError[" +
                "libName=" + libName + ']';
    }


}
