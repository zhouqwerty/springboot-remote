package com.qwerty.springboot.remote.consumer2.controller;

import com.qwerty.springboot.remote.consumer2.entity.DemoEntity;
import com.qwerty.springboot.remote.consumer2.remote.TestRemote2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestRemote2 testRemote;
    @RequestMapping("demo")
    public String demo(){
        return testRemote.test2("22");
    }

    @RequestMapping("demo2")
    public String demo2(){
        DemoEntity demoEntity=new DemoEntity();
        demoEntity.setId("123");
        demoEntity.setName("zhou");
        return testRemote.test(demoEntity);
    }

    @RequestMapping("zuul")
    public String zuul(){
        return "zuul-consumer-2";
    }
}
