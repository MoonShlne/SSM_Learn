package com.myself.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/9 14:27
 */
@RequestMapping("header")
@ResponseBody
public class HeaderController {
    @GetMapping("getHost")

    public String getHeader(@RequestHeader("Host") String header) {
        System.out.println( header);
        return header;


    }
}
