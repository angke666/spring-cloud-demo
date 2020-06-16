package com.qianjin.controller;

import com.qianjin.api.entity.Order;
import com.qianjin.api.util.R;
import com.qianjin.service.IRestOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 16:31
 * @Version 1.0
 **/
@RestController
public class OrderController {
    @Autowired
    private IRestOrderService restOrderService;

    @PostMapping("/order")
    public R makeOrder(@RequestBody Order order) {
        try {
            return restOrderService.handlerBusiness(order);
        } catch (Exception e) {
            return R.failed();
        }
    }

}
