package com.learning.datasources.config.routing;

import com.learning.datasources.config.db.DataSourceType;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Transactional(propagation = Propagation.REQUIRES_NEW)
public @interface WithDatabase {

    DataSourceType value() default DataSourceType.TEST;
}
