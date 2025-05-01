package com.myself.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/1 14:46
 */
@Configuration
@ComponentScan("com.myself")
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class JavaConfig {
    @Value("${myself.url}")
    String url;
    @Value("${myself.driver}")
    String driver;
    @Value("${myself.username}")
    String userName;
    @Value("${myself.password}")
    String password;

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(password);
        return druidDataSource;

    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
     public TransactionManager transactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}
