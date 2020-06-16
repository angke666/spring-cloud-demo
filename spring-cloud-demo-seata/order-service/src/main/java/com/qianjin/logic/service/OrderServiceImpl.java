package com.qianjin.logic.service;

import com.qianjin.api.constant.CommonConstants;
import com.qianjin.api.dubbo.IAccountService;
import com.qianjin.api.dubbo.IOrderService;
import com.qianjin.api.entity.Account;
import com.qianjin.api.entity.Order;
import com.qianjin.api.util.R;
import com.qianjin.logic.mapper.OrderMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 15:52
 * @Version 1.0
 **/
@Slf4j
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Reference
    private IAccountService accountService;

    @Override
    public R createOrder(Order order) {
        try {
            // 扣减余额
            Account account = new Account();
            account.setUserId(order.getUserId());
            account.setBalance(order.getAmount());
            R result = accountService.decrease(account);

            // 创建订单
            order.setOrderNo(UUID.randomUUID().toString());
            orderMapper.insert(order);

            // 判断扣款状态
            if (result.getCode() != CommonConstants.SUCCESS) {
                return R.failed();
            }

            return R.ok();
        } catch (Exception e) {
            log.error("创建订单异常", e);
            return R.failed();
        }
    }
}
