package com.qwerty.springboot.remote.producer1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test(String name){
        return "this is p1"+name;
    }

}
