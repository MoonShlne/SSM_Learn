package com.myself.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/11 18:20
 */
public class SpringIoCInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    //root ioc
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{DataSourceJavaConfig.class, MapperJavaConfig.class, ServiceJavaConfig.class};
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebMvcJavaConfig.class};
    }


    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }



}
