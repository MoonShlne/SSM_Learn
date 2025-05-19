package com.myself.controller;

import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import com.myself.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/16 18:48
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getUsers(){

        List<User> all = userMapper.findAll();
        return all;

    }

    @DeleteMapping
    public  int delete(){
        return service.delete();
    }

}
