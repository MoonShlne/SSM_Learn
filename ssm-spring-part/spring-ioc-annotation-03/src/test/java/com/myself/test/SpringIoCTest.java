package com.myself.test;

import com.myself.ioc_01.XxxController;
import com.myself.ioc_01.XxxDao;
import com.myself.ioc_02.JavaBean;
import com.myself.ioc_03.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 13:43
 */
public class SpringIoCTest {
    @Test
    public  void  test_01(){

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        XxxController controller = applicationContext.getBean(XxxController.class);

        System.out.println(controller);

        Object bean = applicationContext.getBean("xxxService");
        System.out.println(bean);


        applicationContext.close();
    }

    @Test
    public void test2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        JavaBean bean = applicationContext.getBean(JavaBean.class);
        System.out.println(bean);
        applicationContext.close();

    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");
        UserController bean = applicationContext.getBean(UserController.class);
        System.out.println(bean);
        bean.show();
        applicationContext.close();
    }
}
