package com.myself.controller;

import com.myself.pojo.Student;
import com.myself.service.StudentServiceImpl;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/26 16:23
 */
public class StudentController {

    private StudentServiceImpl studentService;

    public void setStudentService(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public  void  findAll(){
    List<Student> all = studentService.findAll();
    System.out.println(all);
}


}
