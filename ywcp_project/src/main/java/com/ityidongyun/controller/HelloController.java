package com.ityidongyun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("hello")  //处理hello请求
    public String hello(){
        return "Hello World!";
    }
}
