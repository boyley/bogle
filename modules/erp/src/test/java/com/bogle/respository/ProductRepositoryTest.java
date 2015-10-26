package com.bogle.respository;

import com.alibaba.fastjson.JSON;
import com.bogle.SampleApplication;
import com.bogle.erp.entity.Product;
import com.bogle.erp.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 赵波 on 2015/10/26.
 */
@SpringApplicationConfiguration(classes = SampleApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class ProductRepositoryTest {

    private static final Logger logger = LoggerFactory.getLogger(ProductRepositoryTest.class);

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testFindPage() {
        Product product = new Product();
        product.setProducer("producer-2");
        Page<Product> page = productRepository.findAll(new PageRequest(0,20),product);
        logger.info(JSON.toJSONString(page));
    }
}
