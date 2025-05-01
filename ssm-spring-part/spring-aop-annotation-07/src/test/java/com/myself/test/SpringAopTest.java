package com.myself.test;

import com.myself.service.Calculator;
import com.myself.service.advice.LogAdvice;
import com.myself.service.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/30 15:33
 */
@SpringJUnitConfig(JavaConfig.class)
public class SpringAopTest {
    @Autowired
    private Calculator calculator;
    @Test
    public  void  test(){
        System.out.println(calculator.div(  1,1));
    }
}
