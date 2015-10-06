package com.bogle.mybatis.config;

import java.lang.annotation.*;

/**
 * Default SqlMapper marker annotation 
 * @author sbcoba
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Mapper {
}