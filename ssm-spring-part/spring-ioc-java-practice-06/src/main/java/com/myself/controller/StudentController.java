package com.myself.controller;

import com.myself.pojo.Student;
import com.myself.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 13:54
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    public  void  findAll(){
        List<Student> all = service.findAll();
        System.out.println(all);
    }

}
