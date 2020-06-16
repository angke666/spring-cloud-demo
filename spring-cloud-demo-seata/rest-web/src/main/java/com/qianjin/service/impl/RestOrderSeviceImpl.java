package com.qianjin.service.impl;

import com.qianjin.api.dubbo.IOrderService;
import com.qianjin.api.dubbo.IProductService;
import com.qianjin.api.entity.Order;
import com.qianjin.api.entity.Product;
import com.qianjin.api.util.R;
import com.qianjin.service.IRestOrderService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @ClassName RestOrderSeviceImpl
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 16:47
 * @Version 1.0
 **/
@Slf4j
@Service
public class RestOrderSeviceImpl implements IRestOrderService {
    @Reference
    private IProductService productService;
    @Reference
    private IOrderService orderService;

    /**
     * 这是AT模式，使用最简单，TCC模式性能高于AT模式，实现稍微复杂点 https://blog.csdn.net/hosaos/article/details/89847554
     * @param orderRequest
     * @return
     * @throws Exception
     */
    @Override
    @GlobalTransactional(timeoutMills = 300000, name = "rest-web")
    public R handlerBusiness(Order orderRequest) throws Exception {
        log.info("开始全局事务：xid=" + RootContext.getXID());
        log.info("begin order:" + orderRequest);

        // 扣减库存
        Product product = new Product();
        product.setProductCode(orderRequest.getProductCode());
        product.setCount(orderRequest.getCount());
        R ProductResult = productService.decrease(product);

        // 创建订单
        Order order = new Order();
        order.setUserId(orderRequest.getUserId());
        order.setAmount(orderRequest.getAmount());
        order.setCount(orderRequest.getCount());
        order.setProductCode(orderRequest.getProductCode());
        R orderResult = orderService.createOrder(order);

        if (orderRequest.getProductCode().equals("GP20200202002")) {
            throw new Exception("系统异常");
        }

        return R.ok();
    }
}
