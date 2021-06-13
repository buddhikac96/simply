package errors.function;

import errors.SimplyError;

public class StartMethodNotExistError implements SimplyError {

    @Override
    public String getErrorMessage() {
        var message = new StringBuilder();
        message.append("Error:");
        message.append(this.getErrorType()).append("\n");
        message.append("start(in: ) method not found \n\n");
        message.append(this.getErrorDescription());
        return message.toString();
    }

    @Override
    public String getErrorType() {
        return "FunctionError:" + this.getClass().getName();
    }

    @Override
    public String getErrorDescription() {
        return "You don’t have a start function in this code. Every code MUST have a start function, because it is the entry/starting point to the program.";
    }

    @Override
    public int getLineNumber() {
        return 0;
    }
}
