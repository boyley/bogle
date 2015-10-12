package org.springframework.data.mybatis.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mybatis.repository.config.EnableMyBatisRepositories;

/**
 * Created by 赵波 on 2015/10/12.
 */
@Configuration
@EnableMyBatisRepositories
@EnableAutoConfiguration
public class MybatisConfig {
}
