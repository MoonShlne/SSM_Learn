package com.myself.ioc_02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 14:36
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class JavaBean {
    @PostConstruct
    public void haha() {
        System.out.println("aa");
    }

    @PreDestroy
    public  void  heiHei(){
        System.out.println(111);
    }
}
