package com.coding.challenge.news.handler;

import com.coding.challenge.news.exception.NotiziaNotFoundException;
import com.coding.challenge.news.models.http.ApiResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {NotiziaNotFoundException.class} )
    ResponseEntity<Object> handleNotiziaNotFoundException(NotiziaNotFoundException e) {
        ApiResponseError apiError = new ApiResponseError(
                e.getMessage(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
