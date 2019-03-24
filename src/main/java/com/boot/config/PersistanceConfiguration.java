package com.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PersistanceConfiguration {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")//go to application.properties and use those properties
    @Primary
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "datasource.flyway")
    public DataSource flywayDataSource(){
        return DataSourceBuilder.create().build();
    }
}
