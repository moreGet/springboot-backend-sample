package com.example.backend_sample.exception.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@ToString
@Getter
@AllArgsConstructor
public enum ErrorCode {
    
    /* 400 잘못된 요청 */
    CANNOT_FIND_PRODUCT_RECORD(BAD_REQUEST, "물건 정보를 찾을 수 없습니다.");

    private final HttpStatus httpStatus;
    private final String errorDesc;
}
