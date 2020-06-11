package com.qianjin.consumer.controller;

import com.qianjin.api.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/11 11:02
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @Reference
    private IHelloService helloService;

    @GetMapping("/say")
    public String say(String name) {
        String message = helloService.say(name);

        return message;
    }

}
