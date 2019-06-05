package com.qwerty.springboot.remote.consumer2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {

    @RequestMapping("demo3")
    public String demo(){
        return "33";
    }
}
