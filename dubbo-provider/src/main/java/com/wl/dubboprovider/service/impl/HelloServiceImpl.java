package com.wl.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wl.dubbointerface.service.HelloService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@Service
@EnableAutoConfiguration
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
