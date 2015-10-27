package com.bogle.erp.service;

import com.bogle.erp.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by lenovo on 2015/10/4.
 */
public interface ProductService {


    Page<Product> findPager(Pageable pageable, Product query);

    /**
     * 保存
     *
     * @param product
     * @return
     */
    Product save(Product product);

    /**
     * 带移除的对象的id
     * @param products
     * @return
     */
    int remove(final List<Product> products);
}
