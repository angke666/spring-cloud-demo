package com.qianjin.provider.dubbo;

import com.qianjin.api.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ClassName HelloServiceImpl
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/11 11:01
 * @Version 1.0
 **/
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String say(String name) {
        return "你好 " + name;
    }

}
