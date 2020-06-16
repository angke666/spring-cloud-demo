package com.qianjin.api.dubbo;

import com.qianjin.api.entity.Order;
import com.qianjin.api.util.R;

/**
 * 订单操作
 * @ClassName IOrderService
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 15:45
 * @Version 1.0
 **/
public interface IOrderService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    R createOrder(Order order);

}
