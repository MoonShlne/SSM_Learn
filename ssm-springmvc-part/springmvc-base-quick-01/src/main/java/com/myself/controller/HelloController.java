package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/7 14:29
 */
@Controller
public class HelloController {
    @RequestMapping("springmvc/hello")  //对外访问地址  在handlerMapping 注册
    @ResponseBody  //直接返回字符
    public String hello() {
        System.out.println("hello");

        return "hello springMvc!";
    }


}
