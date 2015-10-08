package org.springframework.data.mybatis.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

/**
 * MyBatis specific extension of {@link org.springframework.data.repository.Repository}.
 *
 * @author Jean-Christophe Lagache
 */
@NoRepositoryBean
public interface MyBatisRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

    <X extends T> Page<T> findAll(Pageable pageable, X condition);

    <X extends T> Iterable<T> findAll(X condition);

}
