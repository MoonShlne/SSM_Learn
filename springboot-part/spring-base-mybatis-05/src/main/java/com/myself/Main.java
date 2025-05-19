package com.myself;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/16 16:26
 */
@SpringBootApplication
@MapperScan("com.myself.mapper")  //mapper 接口所在位置
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
