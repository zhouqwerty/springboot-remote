package com.qwerty.springboot.remote.consumer.remote.hystrix;

import com.qwerty.springboot.remote.consumer.entity.DemoEntity;
import com.qwerty.springboot.remote.consumer.remote.TestRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class TestRemoteHystrix implements TestRemote {
    @Override
    public String test2(String name) {
        return "出错啦";
    }

    @Override
    public String test(DemoEntity demoEntity) {
        return "出错啦";
    }
}
