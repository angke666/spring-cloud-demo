package com.qianjin.logic.service;

import com.qianjin.api.dubbo.IAccountService;
import com.qianjin.api.entity.Account;
import com.qianjin.api.util.R;
import com.qianjin.logic.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 15:53
 * @Version 1.0
 **/
@Slf4j
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public R decrease(Account account) {
        try {
            int decrease = accountMapper.decrease(account.getUserId(), account.getBalance());
            if (decrease > 0) {
                return R.ok();
            } else {
                return R.failed("余额不足");
            }
        } catch (Exception e) {
            log.error("余额扣除异常", e);
            return R.failed();
        }
    }
}
