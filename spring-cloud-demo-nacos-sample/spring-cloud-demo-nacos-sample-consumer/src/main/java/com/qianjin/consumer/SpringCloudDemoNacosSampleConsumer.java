package com.qianjin.consumer;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName SpringCloudDemoNacosSampleConsumer
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/11 10:57
 * @Version 1.0
 **/
@DubboComponentScan
@SpringBootApplication
public class SpringCloudDemoNacosSampleConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDemoNacosSampleConsumer.class, args);
    }

}
