# Logging Interceptor with AOP

This is a sample Spring Boot application that demonstrates how to implement a logging interceptor using Aspect-Oriented Programming (AOP) with SLF4J.
The application intercepts specific methods in the `com.example.logginginterceptor.web.RestService` class using the `com.example.logginginterceptor.aop.LoggingInterceptor` aspect.

## Prerequisites

- Java Development Kit (JDK) 19
- Maven build tool
- SLF4J dependencies

## Interceptor Configuration

The logging interceptor is implemented using the `com.example.logginginterceptor.aop.LoggingInterceptor` aspect. It intercepts two types of methods in the `com.example.logginginterceptor.web.RestService` class:

1. Methods starting with `f` using the `beforeMethodExecution1` advice.
2. Methods starting with `s` using the `beforeMethodExecution2` advice.

The intercepted methods are logged using SLF4J with an `INFO` level log message.

## Usage

The application exposes a RESTful API with two sample endpoints:

1. `GET /api/method1` - Returns a "Hello World!" message from the `firstMethod` in the `RestService` class.
2. `GET /api/method2` - Returns a "Hello World!" message from the `secondMethod` in the `RestService` class.

When you access these endpoints, the logging interceptor will intercept the method calls and log the intercepted method name using SLF4J.

## Logging Configuration

The logging configuration is handled by Logback, which is the default logging implementation used by Spring Boot. You can customize the logging configuration in the `logback.xml` or `logback-spring.xml` file in the project's classpath.

By default, the logging level is set to `INFO`, which means the intercepted method names will be logged.
