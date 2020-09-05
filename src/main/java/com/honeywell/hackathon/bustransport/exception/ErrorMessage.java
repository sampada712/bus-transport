package com.honeywell.hackathon.bustransport.exception;

public class ErrorMessage {

    private ErrorType errorType;
    private String errorMessage;

    public ErrorMessage(ErrorType errorType, String... params) {
        this.errorType = errorType;
        this.errorMessage = String.format(errorType.getMessage(), params);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
