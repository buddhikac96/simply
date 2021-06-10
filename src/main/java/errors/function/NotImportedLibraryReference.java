package errors.function;

import errors.SimplyError;

import java.util.Objects;

public final class NotImportedLibraryReference implements SimplyError {
    private final String libName;

    public NotImportedLibraryReference(String libName) {
        this.libName = libName;
    }

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

    public String libName() {
        return libName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (NotImportedLibraryReference) obj;
        return Objects.equals(this.libName, that.libName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libName);
    }

    @Override
    public String toString() {
        return "NotImportedLibraryReference[" +
                "libName=" + libName + ']';
    }

}
