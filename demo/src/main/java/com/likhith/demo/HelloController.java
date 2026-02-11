package com.likhith.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Likhith! Spring Boot is working 🚀";
    }
    @GetMapping("/hi")
    public String sayHi() {
        return "hi mate u are doing great";
    }
    
}
