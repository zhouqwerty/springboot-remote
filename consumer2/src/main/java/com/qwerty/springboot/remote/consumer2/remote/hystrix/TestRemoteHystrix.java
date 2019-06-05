package com.qwerty.springboot.remote.consumer2.remote.hystrix;

import com.qwerty.springboot.remote.consumer2.entity.DemoEntity;
import com.qwerty.springboot.remote.consumer2.remote.TestRemote2;
import org.springframework.stereotype.Component;

@Component
public class TestRemoteHystrix implements TestRemote2 {
    @Override
    public String test2(String name) {
        return "出错啦";
    }

    @Override
    public String test(DemoEntity demoEntity) {
        return "出错啦";
    }
}
