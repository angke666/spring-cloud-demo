package com.qianjin.api.dubbo;

import com.qianjin.api.entity.Account;
import com.qianjin.api.util.R;

/**
 * 余额操作
 * @author 钱进
 */
public interface IAccountService {

    /**
     * 余额扣减
     * @param account
     * @return
     */
    R decrease(Account account);

}
