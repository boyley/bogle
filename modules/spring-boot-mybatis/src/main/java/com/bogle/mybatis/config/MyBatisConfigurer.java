package com.bogle.mybatis.config;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.type.TypeHandler;

import java.util.List;

public interface MyBatisConfigurer {
	void addPlugins(List<Interceptor> interceptors);

	void addTypeHandlers(List<TypeHandler<?>> typeHandlers);
}