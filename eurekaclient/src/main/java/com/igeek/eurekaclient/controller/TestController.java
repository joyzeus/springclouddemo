package com.igeek.eurekaclient.controller;

import org.springframework.aop.framework.ProxyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouxu
 * @email 1419982188@qq.com
 * @date 2020/6/6
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;

//    @Qualifier()
//    @Autowired
//    ProxyConfig proxyConfig;

    @GetMapping("/helloworld")
    public String helloworld(ProxyConfig proxyConfig) {
        System.out.println(proxyConfig.isProxyTargetClass());
        return "helloworld " + port;
    }
}
