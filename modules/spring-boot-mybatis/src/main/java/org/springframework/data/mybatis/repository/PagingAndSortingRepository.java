package org.springframework.data.mybatis.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mybatis.repository.support.Contents;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by lenovo on 2015/10/10.
 */
public interface PagingAndSortingRepository<T> {

    /**
     * 分页获取数据
     *
     * @param pageable
     * @return
     */
    Page<T> findByPager(Pageable pageable);

    /**
     * 根据查询条件获取页面
     *
     * @param pageable
     * @param <X>
     * @return
     */
    Page<T> findByPager(@Param(Contents.PAGE_PARAM) Pageable pageable, @Param(Contents.PAGE_PARAM_CONDITION) Map<String, ? extends Serializable> condition);
}
