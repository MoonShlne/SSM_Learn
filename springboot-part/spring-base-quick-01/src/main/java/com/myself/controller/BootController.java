package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/14 18:38
 */
@Controller
@ResponseBody
@RequestMapping("spring")

public class BootController {
@GetMapping("boot")
    public String helloSpring() {
        return "Hello Boot!!";
    }
}
