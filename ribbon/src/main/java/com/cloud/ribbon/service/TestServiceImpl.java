package com.cloud.ribbon.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author lwf
 * @Description //TODO
 */

@Component
public class TestServiceImpl implements  TestService{
    public String sayHello() {
        return "服务调用失败";
    }
}
