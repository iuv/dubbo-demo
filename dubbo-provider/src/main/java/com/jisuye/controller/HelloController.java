package com.jisuye.controller;

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

    @GetMapping
    public String def(){
        return "ixx";
    }
}
