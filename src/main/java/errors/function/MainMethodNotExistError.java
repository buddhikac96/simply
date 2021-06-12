package errors.function;

import errors.SimplyError;

public class MainMethodNotExistError implements SimplyError {

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("main(in: ) method not found \n\n");
        message.append(this.getErrorDescription());
        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "FunctionError:" + this.getClass().getName();
    }

    @Override
    public String getErrorDescription() {
        return "You don’t have a main function in this code. Every code MUST have a main function, because it is the starting point of the program.";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
