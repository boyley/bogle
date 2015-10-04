package com.bogle.erp.service;

import com.bogle.erp.entity.Product;
import org.springframework.data.domain.Page;

/**
 * Created by lenovo on 2015/10/4.
 */
public interface ProductService {

    Page<Product> findPage(Page<Product> page);
}
