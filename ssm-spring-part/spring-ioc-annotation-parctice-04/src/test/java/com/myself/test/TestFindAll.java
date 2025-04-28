package com.myself.test;

import com.myself.controller.XxxController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 19:28
 */
public class TestFindAll {
    @Test
    public  void  findAll(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxController bean = applicationContext.getBean(XxxController.class);
        System.out.println(bean.findAll());
        applicationContext.close();

    }
}
