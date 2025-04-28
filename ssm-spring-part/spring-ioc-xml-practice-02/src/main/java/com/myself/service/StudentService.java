package com.myself.service;

import com.myself.pojo.Student;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/26 16:19
 */
public interface StudentService {

    /**
     * 查询所有的学生信息
     * @return
     */
    List<Student> findAll();
}
