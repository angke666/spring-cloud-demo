package com.qianjin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/16 17:10
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/say")
    public String say() {
        return "[gateway-service]:say Hello";
    }

}
