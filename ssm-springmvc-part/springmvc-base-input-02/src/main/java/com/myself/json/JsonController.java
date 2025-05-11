package com.myself.json;

import com.myself.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/8 20:32
 */
@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {
    @PostMapping("getJson")
    public  String getJson(@RequestBody Person person){
        System.out.println(person);
        return "get Person";
    }

}
