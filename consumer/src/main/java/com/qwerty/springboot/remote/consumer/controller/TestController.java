package com.qwerty.springboot.remote.consumer.controller;

import com.qwerty.springboot.remote.consumer.remote.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestRemote testRemote;
    @RequestMapping("demo")
    public String demo(){
        return testRemote.test2("22");
    }
}
