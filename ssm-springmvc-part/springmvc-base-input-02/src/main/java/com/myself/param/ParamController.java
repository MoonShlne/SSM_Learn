package com.myself.param;

import com.myself.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/7 16:28
 */
@Controller
@RequestMapping("param")
public class ParamController  {

    @RequestMapping("userInfo")
    @ResponseBody
    public  String getParam(String name,Integer age){
        return "name="+name +"age=" +age;
    }

    //account page   前者必须传 后者默认空
    //@requestParam 指定请求参数
    @RequestMapping("userInfoPlus")
    @ResponseBody
    public  String getParam1(@RequestParam(value = "account") String name,@RequestParam(required = false ,defaultValue ="1") Integer age){
        return "name="+name +"age=" +age;

    }

    //一名多值    /hbs=1&hbs=2
@GetMapping("userInfoList")
@ResponseBody
    public  String getParam2(@RequestParam List<String> hbs){
        System.out.println(hbs);
        return "success";
    }

    @RequestMapping("getUser")
    @ResponseBody
    //使用实体对象接值
        public String getUser(User user){
        System.out.println(user);
        return "haja";
        }


}
