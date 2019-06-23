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

    @RequestMapping("zuul")
    public String zuul(){
        return "zuul-pro-1";
    }

    @RequestMapping("test/test3")
    public String test3(String name){
        return "this is test3";
    }

    @RequestMapping("test/test5")
    public String test5(String test){
        return "this is "+test;
    }

    @RequestMapping("test2/test4")
    public String test4(String name){
        return "this is test4";
    }
}
