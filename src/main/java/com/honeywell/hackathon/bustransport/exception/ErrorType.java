package com.honeywell.hackathon.bustransport.exception;

public enum ErrorType {
    UNKNOWN_ERROR("Unknown error occured at server side"),
    RESOURCE_NOT_FOUND("Unable to find resource with id: %s");

    private String msg;

    ErrorType(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
