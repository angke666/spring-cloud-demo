package com.qianjin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName Order
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 15:30
 * @Version 1.0
 **/
@Data
@TableName("seata_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 241580492597184813L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String orderNo;
    private String userId;
    private String productCode;
    private Integer count;
    private BigDecimal amount;
}
