package com.qwerty.springboot.remote.producer1.controller;


import com.qwerty.springboot.remote.producer1.entity.DemoEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test(String name){
        return "this is p1"+name;
    }

    @RequestMapping("test2")
    public String test2(@RequestBody DemoEntity demoEntity){
        return "this is p1"+demoEntity.getName();
    }

}
