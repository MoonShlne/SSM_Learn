package com.myself.controller;

import com.myself.pojo.Student;
import com.myself.service.XxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 19:13
 */
@Controller
public class XxxController {
    @Autowired
    private XxxService xxxService;

    public List<Student> findAll(){
       return xxxService.findAll();
    }
}
