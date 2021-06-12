package errors;

public interface SimplyError {

    String getErrorMessage();

    String getErrorType();

    String getErrorDescription();

    int getLineNumber();
}


