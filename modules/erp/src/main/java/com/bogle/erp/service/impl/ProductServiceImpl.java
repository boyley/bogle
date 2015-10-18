package com.bogle.erp.service.impl;

import com.bogle.erp.entity.Product;
import com.bogle.erp.repository.ProductRepository;
import com.bogle.erp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2015/10/11.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Page<Product> findPager(Pageable pageable) {
        return productRepository.findByPager(pageable);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
