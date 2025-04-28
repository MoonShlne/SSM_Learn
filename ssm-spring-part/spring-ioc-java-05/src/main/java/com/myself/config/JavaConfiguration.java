package com.myself.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 12:54
 * 配置类
 * 包扫描
 * 外部配置文件
 * 第三方依赖
 *
 *
 */
@ComponentScan("com.myself.ioc_01")
@Configuration
@PropertySource("classpath:jdbc.properties")
public class JavaConfiguration {
    @Value("${myself.url}")
    private String url;
    @Value("${myself.driver}")
    private String driver;
    @Value("${myself.username}")
    private String userName;
    @Value("${myself.password}")
    private String password;


    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource dataSource){
        return new JdbcTemplate(dataSource);
    }


}
