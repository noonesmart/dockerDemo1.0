package com.airocov.dockerdemo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @RequestMapping("/sayhello")
    public String sayHello(){
        return "sayhello";
    }
}
