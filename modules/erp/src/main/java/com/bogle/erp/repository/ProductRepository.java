package com.bogle.erp.repository;

import com.bogle.erp.entity.Product;
import org.springframework.data.mybatis.repository.MyBatisRepository;

import java.util.List;

public interface ProductRepository extends MyBatisRepository<Product, Long> {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(Product record);
//
//    int insertSelective(Product record);
//
    Product selectByPrimaryKey(Long id);

    int updateByPrimaryKeysSelective(List<Product> products);
//
//    int updateByPrimaryKey(Product record);
}