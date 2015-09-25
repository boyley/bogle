package com.bogle.erp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


/**
 * Created by Administrator on 2015/9/25.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration implements EnvironmentAware {
    private final Logger log = LoggerFactory.getLogger(SwaggerConfiguration.class);

    private RelaxedPropertyResolver propertyResolver;
    public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";

    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "swagger.");
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(propertyResolver.getProperty("title"))
                .description(propertyResolver.getProperty("description"))
                .termsOfServiceUrl(propertyResolver.getProperty("termsOfServiceUrl"))
                .contact(propertyResolver.getProperty("contact"))
                .license(propertyResolver.getProperty("license"))
                .licenseUrl(propertyResolver.getProperty("licenseUrl"))
                .version(propertyResolver.getProperty("version"))
                .build();
    }
}
