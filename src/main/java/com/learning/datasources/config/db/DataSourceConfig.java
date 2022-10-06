package com.learning.datasources.config.db;

import com.zaxxer.hikari.HikariConfig;
import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class DataSourceConfig {

    private final Environment environment;

    @Bean
    public DataSource getDataSource(){
        Map<Object,Object> dataSources = this.buildDateSources();

        return null;
    }


    private Map<Object, Object> buildDateSources(){

        final Map<Object,Object> result = new HashMap<>();

        for (DataSourceType sourceType : DataSourceType.values()) {

           result.put(sourceType,this.buildDateSource(sourceType));

        }


        return result;
    }

    private DataSource  buildDateSource(DataSourceType sourceType) {
       final HikariConfig config = new HikariConfig();

        config.setJdbcUrl(this.environment.getProperty(String.format("datasource.%s.url",sourceType.getName())));
        config.setUsername(this.environment.getProperty(String.format("datasource.%s.username",sourceType.getName())));
        config.setPassword(this.environment.getProperty(String.format("datasource.%s.password",sourceType.getName())));


        return null;
    }

}
