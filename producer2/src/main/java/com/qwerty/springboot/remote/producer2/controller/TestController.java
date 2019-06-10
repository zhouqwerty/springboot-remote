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

    @RequestMapping("zuul")
    public String zuul(){
        return "zuul-pro-2";
    }

    @RequestMapping("zuul2")
    public String zuul2(){
        System.out.println("zuul2 ........");
        try {
            Thread.sleep(1000000);
        }catch (Exception e){
            System.out.println("error");
        }
        return "zuul2";
    }
}
