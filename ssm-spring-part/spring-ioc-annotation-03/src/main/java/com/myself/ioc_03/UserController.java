package com.myself.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 15:19
 */
@Controller
public class UserController {
    @Autowired //required 默认为true 必须得有
    @Qualifier("userServiceImpl")
    private  UserService userService;

    public  void  show(){
        userService.show();
    }
}
