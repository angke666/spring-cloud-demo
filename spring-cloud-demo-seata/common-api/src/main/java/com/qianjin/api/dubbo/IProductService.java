package com.qianjin.api.dubbo;

import com.qianjin.api.entity.Product;
import com.qianjin.api.util.R;

/**
 * 库存操作
 */
public interface IProductService {

    /**
     * 库存扣减
     * @param product
     * @return
     */
    R decrease(Product product);

}
