package com.example.demosping.account;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AccountControllerHandler {
    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<DemoException> accountNotFound(
        RuntimeException exception
    ) {
        DemoException demoException = new DemoException();
        demoException.setCode(12345);
        demoException.setMessage(exception.getMessage());
        return new ResponseEntity<DemoException>(demoException, HttpStatus.OK);
    }
}

class DemoException {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

