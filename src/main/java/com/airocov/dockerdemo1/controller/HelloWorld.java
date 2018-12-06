package com.airocov.dockerdemo1.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    private  static Logger logger = Logger.getLogger(HelloWorld.class);
    @RequestMapping("/sayhello")
    public String sayHello(){
        logger.info("访问sayHello"+System.getProperty("user.dir"));
        return "sayhello";
    }
}
