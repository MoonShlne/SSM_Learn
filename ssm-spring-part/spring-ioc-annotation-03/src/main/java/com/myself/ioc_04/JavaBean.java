package com.myself.ioc_04;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 17:49
 */
public class JavaBean {
    //方案一 直接赋值
    private String name ="aa";

    //方案二  @value
    @Value("${jdbc.password}")
    private  int password;

}
