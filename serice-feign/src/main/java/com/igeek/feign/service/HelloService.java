package com.igeek.feign.service;

import com.igeek.feign.hystric.HelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhouxu
 * @email 1419982188@qq.com
 * @date 2020/6/6
 */
@FeignClient(value = "eurekaclient", fallback = HelloServiceHystric.class)
public interface HelloService {

    @GetMapping("/helloworld")
    String sayHello();
}
