package com.example.logginginterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LoggingInterceptorSpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoggingInterceptorSpringAopApplication.class, args);
    }

}
