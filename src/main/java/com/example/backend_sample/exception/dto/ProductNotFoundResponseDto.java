package com.example.backend_sample.exception.dto;

import com.example.backend_sample.exception.common.ErrorCode;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Builder
public class ProductNotFoundResponseDto {
    private final HttpStatus httpStatus;
    private final String errorDesc;
    private final String dateTime =
            DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss").format(LocalDateTime.now());

    public static ResponseEntity<ProductNotFoundResponseDto> toEntity(ErrorCode errorCode) {
        return ResponseEntity
                .status(errorCode.getHttpStatus())
                .body(ProductNotFoundResponseDto.builder()
                                .httpStatus(errorCode.getHttpStatus())
                                .errorDesc(errorCode.getErrorDesc())
                                .build());
    }
}