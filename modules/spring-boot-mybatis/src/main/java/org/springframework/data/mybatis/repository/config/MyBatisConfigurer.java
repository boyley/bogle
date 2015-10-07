package org.springframework.data.mybatis.repository.config;

import java.util.List;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.type.TypeHandler;

public interface MyBatisConfigurer {
	void addPlugins(List<Interceptor> interceptors);

	void addTypeHandlers(List<TypeHandler<?>> typeHandlers);
}