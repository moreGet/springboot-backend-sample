package com.example.backend_sample.aop.aspect;

import com.example.backend_sample.util.ThreadLocalUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AopAspect {

    @Before(value = "@annotation(com.example.backend_sample.aop.annotation.AopConfiguration)")
    public void before$InReq(JoinPoint jp) {
        ThreadLocalUtil.createUUID();
        log.info("[ FLOW-IN-REQ {} ] [ AOP ] CALL FIND_ALL METHOD", ThreadLocalUtil.getUUID());
    }

    @AfterReturning(value = "@annotation(com.example.backend_sample.aop.annotation.AopConfiguration)")
    public void afterReturning$InReq(JoinPoint jp) {
        log.info("[ FLOW-IN-RES {} ] [ AOP ] CALL FIND_ALL METHOD", ThreadLocalUtil.getUUID());
        ThreadLocalUtil.deleteUUID();
    }

    @AfterThrowing(value = "@annotation(com.example.backend_sample.aop.annotation.AopConfiguration)")
    public void afterThrowing$InReq(JoinPoint jp) {
        log.info("[ FLOW-IN-RES-ERROR {} ] [ AOP ] CALL FIND_ALL METHOD", ThreadLocalUtil.getUUID());
        ThreadLocalUtil.deleteUUID();
    }
}