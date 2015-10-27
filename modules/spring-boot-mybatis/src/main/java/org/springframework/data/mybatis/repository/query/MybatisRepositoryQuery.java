package org.springframework.data.mybatis.repository.query;

import org.apache.ibatis.binding.MapperMethod;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mapping.model.MappingException;
import org.springframework.data.mybatis.repository.plugin.interceptor.PageInterceptor;
import org.springframework.data.repository.query.Parameter;
import org.springframework.data.repository.query.Parameters;
import org.springframework.data.repository.query.QueryMethod;
import org.springframework.data.repository.query.RepositoryQuery;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Binds spring Repository methods with mybatis mapper
 */
public class MybatisRepositoryQuery extends MapperMethod implements RepositoryQuery {

    private final MyBatisQueryMethod queryMethod;
    private final SqlSessionTemplate sessionTemplate;
    private final SqlCommand command;
    private final MethodSignature method;

    public MybatisRepositoryQuery(MyBatisQueryMethod queryMethod, SqlSessionTemplate sessionTemplate) {
        super(queryMethod.getRepositoryInterface(), queryMethod.getMethod(), sessionTemplate.getConfiguration());
        Assert.notNull(queryMethod);
        Assert.notNull(sessionTemplate);
        this.queryMethod = queryMethod;
        this.sessionTemplate = sessionTemplate;
        this.command = new SqlCommand(sessionTemplate.getConfiguration(), queryMethod.getRepositoryInterface(), queryMethod.getMethod());
        this.method = new MethodSignature(sessionTemplate.getConfiguration(), queryMethod.getMethod());
    }

    @Override
    public Object execute(Object[] parameters) {
//        if (queryMethod.getMethod().getReturnType() == Page.class) {
//            return executeForMany(sessionTemplate, parameters);
//        }
        return ReflectionUtils
                .invokeMethod(queryMethod.getMethod(), sessionTemplate.getMapper(queryMethod.getRepositoryInterface()), parameters);

//        String mappedStatementId = queryMethod.getMappedStatementId();
//        boolean hasStatement = sessionTemplate.getConfiguration().hasStatement(mappedStatementId);
//        if (hasStatement) {
//            return executeFromMapper(mappedStatementId, parameters);
//        }
//        throw new MappingException("can not find mapped statement for method : " + queryMethod.getName());
    }

    private Object executeFromMapper(String mappedStatementId, Object[] parameters) {
        Map<String, Object> params = new HashMap<String, Object>();
        Parameters<?, ?> methodParameters = queryMethod.getParameters();
        if (null != methodParameters) {
            Iterator<? extends Parameter> iterator = methodParameters.iterator();
            while (iterator.hasNext()) {
                Parameter parameter = iterator.next();
                params.put(parameter.getName(), parameters[parameter.getIndex()]);
            }
        }
        if (queryMethod.isSliceQuery()) {

        } else if (queryMethod.isCollectionQuery()) {
            return sessionTemplate.selectList(mappedStatementId, params);
        } else if (queryMethod.isPageQuery()) {
        } else if (queryMethod.isQueryForEntity()) {
            return sessionTemplate.selectOne(mappedStatementId, params);
        }

        return sessionTemplate.selectOne(mappedStatementId, params);

    }

    private <E> Object executeForMany(SqlSession sqlSession, Object[] args) {
        List<E> result;
        PageInterceptor.PAGE_PARAM.set((Pageable) args[0]);
        Object param = method.convertArgsToSqlCommandParam(args);
        if (method.hasRowBounds()) {
            RowBounds rowBounds = method.extractRowBounds(args);
            result = sqlSession.<E>selectList(command.getName(), param, rowBounds);
        } else {
            result = sqlSession.<E>selectList(command.getName(), param);
        }
        Page<E> page = new PageImpl<E>(result, (Pageable) args[0], PageInterceptor.PAGINATION_TOTAL.get());
        PageInterceptor.PAGE_PARAM.remove();
        PageInterceptor.PAGINATION_TOTAL.remove();
        return page;
    }

    @Override
    public QueryMethod getQueryMethod() {
        return queryMethod;
    }
}
