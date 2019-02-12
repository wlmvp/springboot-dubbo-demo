package com.wl.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wl.dubbointerface.service.HelloService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("wlmvp"));
        return hello;
    }
}