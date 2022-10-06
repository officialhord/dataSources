package com.learning.datasources.config.routing;


import com.learning.datasources.config.db.DataSourceType;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Transactional
public @interface WithDatabase {

    DataSourceType value() default DataSourceType.TEST;
}
