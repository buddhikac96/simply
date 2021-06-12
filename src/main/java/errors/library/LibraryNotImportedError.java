package errors.library;

import errors.SimplyError;

public class LibraryNotImportedError implements SimplyError {
    @Override
    public String getErrorMessage() {
        return null;
    }

    @Override
    public String getErrorType() {
        return  "Error:" +
                this.getErrorType() + "\n\n" +
                this.getErrorDescription();
    }

    @Override
    public String getErrorDescription() {
        return "You have forgotten to import the mathematics library. Please import it!";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}

// TODO: Complete the code
// This is equal to NotImportedLibraryError