package com.myself.dao;

import com.myself.pojo.Student;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/26 15:12
 */
public interface StudentDao {

    List<Student> queryAll();
}
