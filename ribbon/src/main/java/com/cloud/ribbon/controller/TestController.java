package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lwf
 * @Description //TODO
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping("/hi")
    public  void  sayHello(){
        String s = testService.sayHello();
        System.out.println(s);
    }



}
