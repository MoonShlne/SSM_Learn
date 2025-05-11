package com.myself.cookie;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/9 13:44
 */
@Controller
@ResponseBody
@RequestMapping("cookie")
public class CookieController {
    @RequestMapping("getCookie")
    public  String   getCookie(@CookieValue(value = "cookieName") String cookie){
        System.out.println(cookie);
        return cookie;
    }

    @RequestMapping("setCookie")
    public String setCookie(HttpServletResponse response){
        Cookie cookieName = new Cookie("cookieName", "god");
        response.addCookie(cookieName);
        return "ok";

    }
}
