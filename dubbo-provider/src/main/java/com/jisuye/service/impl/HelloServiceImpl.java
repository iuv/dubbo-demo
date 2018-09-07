package com.jisuye.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jisuye.service.HelloService;

/**
 * @author chuxianming
 * @description helloservice 实现
 * @date 2018-09-07
 */
@Service
public class HelloServiceImpl implements HelloService{

    @Override
    public String def(String name) {
        return "hello " + name;
    }
}
