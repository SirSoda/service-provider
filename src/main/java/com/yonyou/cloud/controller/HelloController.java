package com.yonyou.cloud.controller;

import com.yonyou.commons.feign.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloService {
    @Override
    public String hello(String s) {
//        if(true)
//            throw new RuntimeException();
        return "hello " + s;
    }
}
