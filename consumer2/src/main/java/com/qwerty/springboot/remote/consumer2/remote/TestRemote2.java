package com.qwerty.springboot.remote.consumer2.remote;

import com.qwerty.springboot.remote.consumer2.entity.DemoEntity;
import com.qwerty.springboot.remote.consumer2.remote.hystrix.TestRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-boot-producer2",fallback = TestRemoteHystrix.class)
public interface TestRemote2 {
    /*
    * 这里要保证请求url一致，不过方法名和返回值类型可以不同
    * */
    @RequestMapping("test")
    String test2(@RequestParam("name") String name);

    @RequestMapping("test2")
    String test(@RequestBody DemoEntity demoEntity);
}
