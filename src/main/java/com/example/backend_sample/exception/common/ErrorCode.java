package com.example.backend_sample.exception.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    
    /* 400 잘못된 요청 */
    CANNOT_FIND_PRODUCT_RECORD(BAD_REQUEST, "리프레시 토큰이 유효하지 않습니다.");

    private final HttpStatus httpStatus;
    private final String errorDesc;
}
