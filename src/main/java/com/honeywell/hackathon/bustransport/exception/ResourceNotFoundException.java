package com.honeywell.hackathon.bustransport.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ApiBaseException {

    public ResourceNotFoundException(Throwable t, ErrorMessage errorMessage) {
        super(t, errorMessage);
    }

    @Override
    public HttpStatus getHttpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
