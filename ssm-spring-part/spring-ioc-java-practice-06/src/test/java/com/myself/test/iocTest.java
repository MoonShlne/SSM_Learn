package com.myself.test;

import com.myself.config.JavaConfiguration;
import com.myself.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 14:09
 */
@SpringJUnitConfig(value = JavaConfiguration.class)


public class iocTest {
    @Autowired
    private StudentController controller;

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        StudentController bean = applicationContext.getBean(StudentController.class);
        bean.findAll();
        applicationContext.close();
    }

    @Test
    public void test2() {
        System.out.println(controller);
    }
}
