package com.lifeway.lifewaytest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler (IllegalStateException.class)
    protected ResponseEntity<Object> handleConflict(
            IllegalStateException ex) {
        Map<String, Object> rtn = new LinkedHashMap<>();

        rtn.put("Error Code",HttpStatus.INTERNAL_SERVER_ERROR.value());
        rtn.put("Status",HttpStatus.INTERNAL_SERVER_ERROR);
        rtn.put("message",ex.getMessage());

        return new ResponseEntity<Object>(rtn, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
