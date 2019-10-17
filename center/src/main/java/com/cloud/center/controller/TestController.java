package com.cloud.center.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lwf
 * @Description //TODO
 */
@RestController
@RequestMapping("/test")
public class TestController
{

    @PostMapping("/hi")
    public String   sayHi(){
        return "hello";
    }
}
