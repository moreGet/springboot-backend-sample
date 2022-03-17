package com.example.backend_sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Vue Front와 통신시 크로스 도메인 허용을 위한 설정
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(false); // true 시 allowedOrigins에 설정한 부분에 대해 크로스 도메인 허용 안함(NOT 개념)
    }
}
