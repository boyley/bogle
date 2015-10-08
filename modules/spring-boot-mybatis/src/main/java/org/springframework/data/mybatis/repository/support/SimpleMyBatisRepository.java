package org.springframework.data.mybatis.repository.support;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mybatis.repository.MyBatisRepository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Specifies Default binding for findOne, findAll, exists, count methods
 * between org.springframework.data.mybatis.repository.MyBatisRepository and mybatis mapper
 */
public class SimpleMyBatisRepository<T, ID extends Serializable> extends SqlSessionRepositorySupport implements MyBatisRepository<T, ID> {

    private final RepositoryInformation repositoryInformation;

    public SimpleMyBatisRepository(SqlSessionTemplate sessionTemplate, RepositoryInformation repositoryInformation) {
        super(sessionTemplate);
        Assert.notNull(sessionTemplate, "SqlSessionTemplate must not be null!");
        this.repositoryInformation = repositoryInformation;
    }

    @Override
    public <S extends T> S save(S entity) {
        return null;
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> entities) {
        return null;
    }

    @Override
    public T findOne(ID id) {
        Map<String, ID> params = new HashMap<>();
        params.put("pk", id);
        return selectOne("find", params);
    }

    @Override
    public List<T> findAll() {
        Map<String, ID> params = new HashMap<>();
        return selectList("find", params);
    }

    @Override
    public Iterable<T> findAll(Iterable<ID> ids) {
        return null;
    }

    @Override
    public boolean exists(ID id) {
        return findOne(id) != null;
    }

    @Override
    public long count() {
        return findAll().size();
    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void delete(Iterable<? extends T> entities) {

    }

    @Override
    public void deleteAll() {

    }


    @Override
    protected String getNamespace() {
        return this.repositoryInformation.getRepositoryInterface().getName();
    }

    @Override
    public Iterable<T> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return null;
    }
}
