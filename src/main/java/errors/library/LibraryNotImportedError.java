package errors.library;

import errors.SimplyError;

public class LibraryNotImportedError implements SimplyError {
    @Override
    public String getErrorMessage() {
        return null;
    }

    @Override
    public String getErrorType() {
        return null;
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}

// TODO: Complete the code
// This is equal to NotImportedLibraryError