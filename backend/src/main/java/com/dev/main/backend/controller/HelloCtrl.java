package com.dev.main.backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin
public class HelloCtrl {
    
    private static final Logger log = LogManager.getLogger(HelloCtrl.class);

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        log.info("name = " + name);
        return "Hello " + name;
    }
    
}