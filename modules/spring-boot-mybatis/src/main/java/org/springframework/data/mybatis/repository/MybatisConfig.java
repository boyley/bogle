package org.springframework.data.mybatis.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mybatis.repository.config.EnableMyBatisRepositories;
import org.springframework.data.mybatis.repository.config.MyBatisProperties;

/**
 * Created by 赵波 on 2015/10/12.
 */
@Configuration
@EnableMyBatisRepositories
@EnableAutoConfiguration
@EnableConfigurationProperties(MyBatisProperties.class)
public class MybatisConfig {
}
