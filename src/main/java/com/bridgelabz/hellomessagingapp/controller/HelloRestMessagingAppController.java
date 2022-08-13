package com.bridgelabz.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestMessagingAppController {
    @GetMapping(value = {"", "/", "/home"})
    public String sayHello(){
        return "Hello From Bridgelabz!";
    }

    @GetMapping("/query")
    public String queryParam(@RequestParam String name){
        return "Hello "+name+" From Bridgelabz";
    }
    @GetMapping("/param/{name}")
    public String getName (@PathVariable String name) {
        return "Hello "+name+" From Bridgelabz";    }
}
