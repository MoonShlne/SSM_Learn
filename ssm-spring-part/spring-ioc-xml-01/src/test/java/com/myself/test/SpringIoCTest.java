package com.myself.test;

import com.myself.ioc_03.HappyComponent;
import com.myself.ioc_05.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/25 13:43
 */
public class SpringIoCTest {
    //创建容器
    public  void  createIoC(){
        //选择合适的容器实现

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");



    }


    //获取bean
    @Test
public  void  getBeanFromIoC(){
    ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();
    classPathXmlApplicationContext.setConfigLocation("spring-03.xml");
    classPathXmlApplicationContext.refresh();


    HappyComponent happyComponent = (HappyComponent) classPathXmlApplicationContext.getBean("happyComponent");

        HappyComponent happyComponent1 = classPathXmlApplicationContext.getBean("happyComponent", HappyComponent.class);
        //TODO  ioc配置只能与一个bean
        HappyComponent happyComponent2 = classPathXmlApplicationContext.getBean(HappyComponent.class);

        System.out.println(happyComponent);
        System.out.println(happyComponent1);
        System.out.println(happyComponent2);

    }


    @Test
    public void test04(){
        //测试初始化和销毁
        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("spring-04.xml");

        application.close();

    }

    @Test
    public void test5(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-05.xml");
        JavaBean javaBean = classPathXmlApplicationContext.getBean("javaBean", JavaBean.class);
    //todo  工厂类也在ioc容器里面，用&id获取
        Object bean = classPathXmlApplicationContext.getBean("&javaBean");
        System.out.println(bean);
        System.out.println(javaBean);
    }

}
