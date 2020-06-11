package com.qianjin.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName SpringCloudDemoNacosConfig
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/11 15:54
 * @Version 1.0
 **/
@SpringBootApplication
public class SpringCloudDemoNacosConfig {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringCloudDemoNacosConfig.class, args);
        // 循环用于测试动态更新配置
//        while (true) {
            // 从Environment中读取配置
            String info = context.getEnvironment().getProperty("info");
            System.out.println(info);
//        }
    }

}
