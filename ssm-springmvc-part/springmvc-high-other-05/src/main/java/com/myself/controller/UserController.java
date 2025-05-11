package com.myself.controller;

import com.myself.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.zip.ZipEntry;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/10 14:57
 */
@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {
@RequestMapping("e1")
    public String byZero() {
        int i = 2+1;
        return "haha";

    }
@RequestMapping("e2")
    public String nullPoint() {
        Integer i = null;
        return "xixi";
    }


    @PostMapping("register")
    public Object  register(@Validated @RequestBody User user , BindingResult bindingResult){
    if (bindingResult.hasErrors()){
        HashMap hashMap = new HashMap();
        hashMap.put("code",400);
        hashMap.put("info","输入非法");
        return hashMap;
    }
    return user;
    }
}
