package com.qwerty.springboot.remote.consumer.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-boot-producer")
public interface TestRemote {
    @RequestMapping("test")
    String test2(@RequestParam("name") String name);
}
