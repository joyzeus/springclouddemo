package com.igeek.feign.hystric;

import com.igeek.feign.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author zhouxu
 * @email 1419982188@qq.com
 * @date 2020/6/6
 */
@Component
public class HelloServiceHystric implements HelloService {
    @Override
    public String sayHello() {
        return "say hello error from feign";
    }
}
