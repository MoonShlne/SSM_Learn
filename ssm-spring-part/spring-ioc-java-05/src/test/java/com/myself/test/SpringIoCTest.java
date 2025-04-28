package com.myself.test;

import com.myself.config.JavaConfiguration;
import com.myself.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 12:59
 */
public class SpringIoCTest {

    @Test
    public void  testAnnotationTest(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        StudentController bean = applicationContext.getBean(StudentController.class);
        System.out.println(bean);
        applicationContext.close();

    }
}
