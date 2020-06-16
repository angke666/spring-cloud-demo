package com.qianjin.logic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qianjin.api.entity.Product;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends BaseMapper<Product> {

    int decrease(@Param("productCode") String productCode, @Param("count") Integer count);

}
