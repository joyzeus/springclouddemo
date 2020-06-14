package com.igeek.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhouxu
 * @email 1419982188@qq.com
 * @date 2020/6/6
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "sayHelloError")
    public String sayHello() {
        return restTemplate.getForObject("http://eurekaclient/helloworld", String.class);
    }

    public String sayHelloError() {
        return "say hello error";
    }
}
