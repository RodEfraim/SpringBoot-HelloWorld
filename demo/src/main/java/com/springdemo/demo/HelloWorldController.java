package com.springdemo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld(){
        System.out.println("Hello world from the terminal...");
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbye(){
        System.out.println("Goodbye from the terminal...");
        return "Goodbye from Spring Boot";
    }
}
