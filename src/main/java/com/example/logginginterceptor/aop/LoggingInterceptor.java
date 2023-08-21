package com.example.logginginterceptor.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Before("execution(* com.example.logginginterceptor.*.*.f*(..))")
    public void beforeMethodExecution1(JoinPoint joinPoint) {
        logger.info("Intercepted method:::::: {}", joinPoint.getSignature().toShortString());
    }

    @Before("execution(* com.example.logginginterceptor.*.*.s*(..))")
    public void beforeMethodExecution2(JoinPoint joinPoint) {
        logger.info("Intercepted method:::::: {}", joinPoint.getSignature().toShortString());
    }
}