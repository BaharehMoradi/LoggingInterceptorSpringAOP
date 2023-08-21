package com.example.logginginterceptor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestService {

    @GetMapping("method1")
    public String firstMethod() {
        return "Hello World! from method1!";
    }

    @GetMapping("/method2")
    public String secondMethod() {
        return "Hello World! from method2!";
    }

}
