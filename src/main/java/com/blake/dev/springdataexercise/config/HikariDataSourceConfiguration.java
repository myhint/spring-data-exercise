package com.blake.dev.springdataexercise.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Blake on 2018/10/5
 */
@Configuration
public class HikariDataSourceConfiguration {

//    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariDataSource hikariDataSource() {

        return new HikariDataSource();
    }

}
