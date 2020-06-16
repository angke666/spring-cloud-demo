package com.qianjin.service;

import com.qianjin.api.entity.Order;
import com.qianjin.api.util.R;

/**
 * @ClassName RestOrderServiceImpl
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 16:45
 * @Version 1.0
 **/
public interface IRestOrderService {

    /**
     * 交易业务
     * @param order
     * @return
     */
    R handlerBusiness(Order order) throws Exception;

}
