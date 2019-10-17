package com.cloud.ribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author lwf
 * @Description //TODO
 */
@FeignClient(value = "cloud-center",fallback = TestServiceImpl.class)
public interface TestService {

    @PostMapping("/test/hi")
    String  sayHello();
}
