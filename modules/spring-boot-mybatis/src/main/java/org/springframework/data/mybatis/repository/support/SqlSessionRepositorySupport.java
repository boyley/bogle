package org.springframework.data.mybatis.repository.support;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jarvis@caomeitu.com
 * @date 15/9/8
 */
public abstract class SqlSessionRepositorySupport {

    private static final char DOT = '.';
    private final SqlSessionTemplate sqlSession;

    protected SqlSessionRepositorySupport(SqlSessionTemplate sqlSessionTemplate) {
        Assert.notNull(sqlSessionTemplate);
        this.sqlSession = sqlSessionTemplate;
    }


    public SqlSession getSqlSession() {
        return this.sqlSession;
    }

    /**
     * Sub class can override this method.
     *
     * @return
     */
    protected abstract String getNamespace();

    /**
     * get the mapper statement include namespace.
     *
     * @param partStatement
     * @return
     */
    protected String getStatement(String partStatement) {
        return getNamespace() + DOT + partStatement;
    }

    /**
     * select one query.
     *
     * @param statement
     * @param <T>
     * @return
     */
    protected <T> T selectOne(String statement) {
        return getSqlSession().selectOne(getStatement(statement));
    }

    protected <T> T selectOne(String statement, Object parameter) {
        return getSqlSession().selectOne(getStatement(statement), parameter);
    }

    protected <T> List<T> selectList(String statement) {
        return getSqlSession().selectList(getStatement(statement));
    }

    protected <T> List<T> selectList(String statement, Object parameter) {
        return getSqlSession().selectList(getStatement(statement), parameter);
    }

    protected int insert(String statement) {
        return getSqlSession().insert(getStatement(statement));
    }

    protected int insert(String statement, Object parameter) {
        return getSqlSession().insert(getStatement(statement), parameter);
    }

    protected int update(String statement) {
        return getSqlSession().update(getStatement(statement));
    }

    protected int update(String statement, Object parameter) {
        return getSqlSession().update(getStatement(statement), parameter);
    }

    protected int delete(String statement) {
        return getSqlSession().delete(getStatement(statement));
    }

    protected int delete(String statement, Object parameter) {
        return getSqlSession().delete(getStatement(statement), parameter);
    }
}