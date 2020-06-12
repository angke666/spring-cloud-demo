package com.qianjin.sentinel.sentinel;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlBlockHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 触发限流后的处理
 * （这里是返回json数据，也可以返回一个页面，在application里面配置spring.cloud.sentinel.servlet.block-pack={url}）
 * @ClassName CustomUrlBlockHandler
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/12 15:12
 * @Version 1.0
 **/
@Service
public class CustomUrlBlockHandler implements UrlBlockHandler {

    @Override
    public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
        httpServletResponse.setHeader("Content-Type", "application/json;charset=UTF-8");
        String message = "{{\"code\":999, \"msg\":\"访问人数过多\"}";
        httpServletResponse.getWriter().write(message);
    }

}
