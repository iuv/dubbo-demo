package com.jisuye.controller;

import com.jisuye.service.HelloService;
import com.reger.dubbo.annotation.Inject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chuxianming
 * @description hello controller
 * @date 2018-09-07
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Inject private HelloService helloService;

    @GetMapping
    public String def(){
        return helloService.def("ixx");
    }
}
