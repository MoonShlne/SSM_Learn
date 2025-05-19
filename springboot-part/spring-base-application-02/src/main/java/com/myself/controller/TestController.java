package com.myself.controller;

import com.myself.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/15 14:40
 */
@Controller
@RequestMapping("test")
@ResponseBody
public class TestController {
    @Autowired
    private User user;

    @GetMapping("getHaHa")
    public User getHaha(){
        return  user;
    }

}
