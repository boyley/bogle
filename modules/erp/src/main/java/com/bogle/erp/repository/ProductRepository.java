package com.bogle.erp.repository;

import com.bogle.erp.entity.Product;
import org.springframework.data.mybatis.repository.MyBatisRepository;
import org.springframework.data.mybatis.repository.PagingAndSortingRepository;

public interface ProductRepository extends MyBatisRepository<Product, Long>, PagingAndSortingRepository<Product> {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(Product record);
//
//    int insertSelective(Product record);
//
//    Product selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(Product record);
//
//    int updateByPrimaryKeyWithBLOBs(Product record);
//
//    int updateByPrimaryKey(Product record);
}