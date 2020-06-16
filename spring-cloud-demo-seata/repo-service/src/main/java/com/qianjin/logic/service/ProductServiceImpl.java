package com.qianjin.logic.service;

import com.qianjin.api.dubbo.IProductService;
import com.qianjin.api.entity.Product;
import com.qianjin.api.util.R;
import com.qianjin.logic.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author 钱进
 * @Date 2020/6/15 15:54
 * @Version 1.0
 **/
@Slf4j
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public R decrease(Product product) {
        try {
            int decrease = productMapper.decrease(product.getProductCode(), product.getCount());
            if (decrease > 0) {
                return R.ok();
            } else {
                return R.failed("库存不足");
            }
        } catch (Exception e) {
            log.error("扣除库存异常", e);
            return R.failed();
        }
    }
}
