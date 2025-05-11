package com.myself.path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/8 14:55
 */
@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {

@RequestMapping("{username}/{password}")
    public String getUser(@PathVariable String username,@PathVariable  String password) {
        return "username    " + username + "password   " +password;
    }

}
