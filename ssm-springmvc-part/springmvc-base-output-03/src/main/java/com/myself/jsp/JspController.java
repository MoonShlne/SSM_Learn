package com.myself.jsp;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/9 16:14
 */
@Controller
@RequestMapping("jsp")
public class JspController {

    @GetMapping("index")
    public String index(HttpServletRequest request) {
        request.setAttribute("data", "hello JSP");
        return "index";
    }

    //条件转发
    @GetMapping("forward")
    public String forward() {
        return "forward:/jsp/index";
    }

    //重定向
    @GetMapping("redirect")
    public String redirect() {
        return "redirect:/jsp/index";
    }

    @GetMapping("redirect/baidu")
    public String redirectBaiDu() {
        return "redirect:https://www.baidu.com";
    }

}
