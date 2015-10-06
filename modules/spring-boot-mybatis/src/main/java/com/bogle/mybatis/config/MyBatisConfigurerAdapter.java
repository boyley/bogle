package com.bogle.mybatis.config;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.type.TypeHandler;

import java.util.List;

public class MyBatisConfigurerAdapter implements MyBatisConfigurer {

	@Override
	public void addPlugins(List<Interceptor> interceptors) {
		
	}

	@Override
	public void addTypeHandlers(List<TypeHandler<?>> typeHandlers) {
	}

}