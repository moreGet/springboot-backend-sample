package com.example.backend_sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @EnableAspectJAutoProxy의 proxyTargetClass=true : CGLIB구현
 * @EnableAspectJAutoProxy의 proxyTargetClass=false : jdk dynamic proxy구현 (default)
 */
@EnableAspectJAutoProxy
@Configuration
public class AppAopConfig {

}
