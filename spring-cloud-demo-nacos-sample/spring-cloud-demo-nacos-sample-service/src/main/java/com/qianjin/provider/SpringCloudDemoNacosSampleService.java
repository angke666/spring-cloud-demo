package com.qianjin.provider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SpringCloudDemoNacosSampleService
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/11 10:52
 * @Version 1.0
 **/
@DubboComponentScan
@SpringBootApplication
public class SpringCloudDemoNacosSampleService {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoNacosSampleService.class, args);
    }

}
