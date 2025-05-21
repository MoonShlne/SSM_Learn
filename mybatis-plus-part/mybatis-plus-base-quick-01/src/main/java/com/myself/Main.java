package com.myself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/19 14:21
 */
@SpringBootApplication
@MapperScan("com.myself.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
