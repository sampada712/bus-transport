package com.honeywell.hackathon.bustransport.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    Logger LOGGER = LoggerFactory.getLogger(ApiExceptionHandler.class);

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handleRuntimeException(Exception ex) {
        LOGGER.error("Exception occured", ex);
        return new ResponseEntity<>(new ErrorMessage(ErrorType.UNKNOWN_ERROR, null), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ApiBaseException.class)
    public ResponseEntity<ErrorMessage> handleApiException(ApiBaseException ex) {
        LOGGER.error("Exception occured", ex);
        return new ResponseEntity<>(ex.getErrorMessage(), ex.getHttpStatus());
    }
}
