package com.qianjin;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName AccountApplication
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 14:37
 * @Version 1.0
 **/
@DubboComponentScan
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
