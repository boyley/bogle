package org.springframework.data.mybatis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * MyBatis specific extension of {@link org.springframework.data.repository.Repository}.
 *
 * @author Jean-Christophe Lagache
 */
@NoRepositoryBean
public interface MyBatisRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {

}
