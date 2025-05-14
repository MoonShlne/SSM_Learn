package com.myself.conifg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/11 13:49
 * 视图解析
 * 静态资源解析
 * 拦截器
 * 全局异常处理类
 * controller
 * mvc包  以及  拦截器包
 *
 */
@Controller
@EnableWebMvc
@ComponentScan({"com.myself.controller", "com.myself.exceptionhandle"})  //扫描controller层，全局异常处理类
public class WebMvcJavaConfig implements WebMvcConfigurer {
    //静态资源处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
//
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views","jsp");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor();
    }
}
