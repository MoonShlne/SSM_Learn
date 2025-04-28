package com.myself.ioc_05;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/25 15:45

 1.实现接口
 */

public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {



    @Override
    public JavaBean getObject() throws Exception {
        return new JavaBean();
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
}
