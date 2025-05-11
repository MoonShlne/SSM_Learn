package com.myself.controller;

import com.myself.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.datatransfer.DataFlavor;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/10 13:17
 */
@Controller
@ResponseBody
public class UserController {
    //分页查询    get请求   param传参   地址为user
    @GetMapping("user")
    public String queryByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize) {
        return "json";
    }

    //用户添加  post 请求   json传参   地址 user
    @PostMapping("user")
    public String addUser(@RequestBody User user) {
        //add user
        return "query ok";
    }

    //用户详情 get请求       路径传参   地址user
    @GetMapping("user/{id}")
    public String userInfo(@PathVariable Integer id) {
        return "userInfo";
    }

    //用户更新  put请求    json传参  地址user
    @PutMapping("user")
    public String updateUser(@RequestBody User user) {
        return "query changed";
    }

    //用户删除  delete请求   路径传参 地址user
    @DeleteMapping("user/{id}")
    public  String deleteUser  (@PathVariable Integer id){
        return "deleted";
    }

    //条件模糊 post请求 json传参 地址search
    @PostMapping("search")
    public  String search(@RequestBody User user){
        return  "aa";

    }

}
