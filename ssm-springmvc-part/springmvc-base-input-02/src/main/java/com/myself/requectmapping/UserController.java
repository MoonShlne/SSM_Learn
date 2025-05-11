package com.myself.requectmapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author polar
 * @version 1.0
 * @since 2025/5/7 16:20
 */
@Controller
@RequestMapping("/user")  // 添加类级别的映射

public class UserController {

    //两者相同
//    @GetMapping("login")
//    @GetMapping("login")
    @RequestMapping("login")
    public void login() {
        System.out.println(11);
    }

    @RequestMapping("register")
    public void register() {
        System.out.println(22);
    }
}
