package com.myself.ioc_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 12:52
 */
@Controller
public class StudentController {
    @Autowired
    private  StudentService service;
}
