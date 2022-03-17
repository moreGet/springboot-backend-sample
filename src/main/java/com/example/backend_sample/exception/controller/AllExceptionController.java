package com.example.backend_sample.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class AllExceptionController {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity runTimeException() {
        return ResponseEntity.badRequest().build();
    }
}