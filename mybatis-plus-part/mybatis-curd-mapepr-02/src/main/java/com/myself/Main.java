package com.myself;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/19 14:21
 */
@SpringBootApplication
@MapperScan("com.myself.mapper")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
        @Bean
        public MybatisPlusInterceptor mybatisPlusInterceptor(){
            MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
            mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
            mybatisPlusInterceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
            mybatisPlusInterceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
            return  mybatisPlusInterceptor;
        }
}

