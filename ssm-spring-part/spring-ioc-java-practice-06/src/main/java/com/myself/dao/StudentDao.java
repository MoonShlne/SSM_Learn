package com.myself.dao;

import com.myself.pojo.Student;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 13:58
 */
public interface StudentDao {
    List<Student> findAll();
}
