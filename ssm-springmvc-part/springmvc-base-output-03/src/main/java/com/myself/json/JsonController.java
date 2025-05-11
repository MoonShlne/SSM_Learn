package com.myself.json;

import com.myself.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/9 18:31
 */
@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {
    @RequestMapping("getJson")
    public User getJson(@RequestBody User user){
        user.setAge(999);
        return user;
    }

    @RequestMapping("getJsonList")
    public ArrayList<User> getJsonList(@RequestBody User user){
        user.setAge(999);
        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(user);
        return  users;
    }


}
