package com.qianjin.logic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qianjin.api.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface AccountMapper extends BaseMapper<Account> {

    int decrease(@Param("userId") String userId, @Param("balance") BigDecimal balance);

}
