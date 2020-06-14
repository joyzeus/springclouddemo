package com.igeek.feign.controller;

import com.igeek.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxu
 * @email 1419982188@qq.com
 * @date 2020/6/6
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/helloworld")
    public String sayHello() {
        return helloService.sayHello();
    }
}
