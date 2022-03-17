package com.example.backend_sample.exception.controller;

import com.example.backend_sample.exception.ProductNotFoundException;
import com.example.backend_sample.exception.common.ErrorCode;
import com.example.backend_sample.exception.dto.ProductNotFoundResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class AllExceptionController {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundResponseDto> runTimeException() {
        return ProductNotFoundResponseDto.toEntity(ErrorCode.CANNOT_FIND_PRODUCT_RECORD);
    }
}