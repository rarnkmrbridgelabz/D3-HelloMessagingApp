package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestMessagingAppController {
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello From Bridgelabz!";
    }
}
