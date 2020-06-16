package com.qianjin;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName AccountApplication
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 14:37
 * @Version 1.0
 **/
@MapperScan("com.qianjin.logic.mapper.**")
@DubboComponentScan
@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
