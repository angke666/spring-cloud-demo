package com.qianjin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Product
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 15:31
 * @Version 1.0
 **/
@Data
@TableName("seata_repo")
public class Product implements Serializable {
    private static final long serialVersionUID = 3683203285727289229L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String productCode;
    private String name;
    private Integer count;
}
