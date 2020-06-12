package com.qianjin.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/11 18:08
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @GetMapping("/dash")
    public String dash() {
        return "Hello Dash";
    }

}
