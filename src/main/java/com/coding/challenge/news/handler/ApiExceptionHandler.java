package com.coding.challenge.news.handler;

import com.coding.challenge.news.costants.Errors;
import com.coding.challenge.news.exception.NotiziaNotFoundException;
import com.coding.challenge.news.models.https.ApiResponseError;
import com.coding.challenge.news.util.MessageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @Autowired
    MessageSource messageSource;

    @ExceptionHandler(value = {NotiziaNotFoundException.class} )
    ResponseEntity<Object> handleNotiziaNotFoundException(NotiziaNotFoundException e) {
        ApiResponseError apiError = new ApiResponseError(
                MessageUtils.getMessage(Errors.ARTCICLE_NOT_FOUND),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
