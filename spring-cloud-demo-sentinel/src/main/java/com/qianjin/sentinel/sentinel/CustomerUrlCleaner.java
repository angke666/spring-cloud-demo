package com.qianjin.sentinel.sentinel;

import com.alibaba.csp.sentinel.adapter.servlet.callback.UrlCleaner;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * 资源清洗
 * Sentinel限流默认实现会把每个不同的Url都作为不同的资源的来处理，但是当controller的路径比如是/clean/{id}这种形式的话（会导致限流统计不准确），
 * 其实应该算一个资源来处理，所以就用了下面的写法
 * @ClassName CustomerUrlCleaner
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/12 15:26
 * @Version 1.0
 **/
@Service
public class CustomerUrlCleaner implements UrlCleaner {

    @Override
    public String clean(String originUrl) {
        if (StringUtils.isEmpty(originUrl)) {
            return originUrl;
        }
        if (originUrl.startsWith("/clean/")) {
            return "/clean/*";
        }

        return originUrl;
    }

}
