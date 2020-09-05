package com.honeywell.hackathon.bustransport.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiBaseException extends Exception {

    private final ErrorMessage errorMessage;

    public ApiBaseException(Throwable throwable, ErrorMessage errorMessage) {
        super(errorMessage.getErrorMessage(), throwable);
        this.errorMessage = errorMessage;

    }

    public ErrorMessage getErrorMessage() {
        return errorMessage;
    }

    public abstract HttpStatus getHttpStatus();
}
