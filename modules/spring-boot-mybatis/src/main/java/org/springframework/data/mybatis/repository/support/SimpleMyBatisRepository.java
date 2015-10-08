package org.springframework.data.mybatis.repository.support;

import org.mybatis.spring.SqlSessionTemplate;
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

    private final SqlSessionTemplate sessionTemplate;
    private final RepositoryInformation repositoryInformation;

    public SimpleMyBatisRepository(SqlSessionTemplate sessionTemplate, RepositoryInformation repositoryInformation) {
        super(sessionTemplate);
        Assert.notNull(sessionTemplate, "SqlSessionTemplate must not be null!");
        this.sessionTemplate = sessionTemplate;
        this.repositoryInformation = repositoryInformation;
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
        return sessionTemplate.selectList("find", params);
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
    protected String getNamespace() {
        return this.repositoryInformation.getRepositoryInterface().getName();
    }
}
