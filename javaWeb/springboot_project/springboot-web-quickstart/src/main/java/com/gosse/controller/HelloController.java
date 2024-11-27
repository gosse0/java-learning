package com.gosse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 史传正
 * @Create: 2024-11-27-21:47
 * -------------------------
 * className: HelloController
 * Description:请求处理类
 */
@RestController
public class HelloController {
    @RequestMapping("/test")
    public String hello(){
        System.out.println("Hello World");
        return "Hello World";
    }
}
