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

    /**
     * 查询制定条件的所有数据
     * @param query
     * @return
     */
    List<Product> find(Product query);


//
//    int updateByPrimaryKey(Product record);
}