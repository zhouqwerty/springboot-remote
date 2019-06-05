package com.qwerty.springboot.remote.producer2.controller;


import com.qwerty.springboot.remote.producer2.entity.DemoEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "this is p2";
    }

    @RequestMapping("test2")
    public String test2(@RequestBody DemoEntity demoEntity){
        return "this is p1"+demoEntity.getName();
    }

}
