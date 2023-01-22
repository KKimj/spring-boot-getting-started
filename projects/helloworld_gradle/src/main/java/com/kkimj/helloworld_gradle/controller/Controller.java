package com.kkimj.helloworld_gradle.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String hello_world() {
        return "Hello World!";
    }
}
