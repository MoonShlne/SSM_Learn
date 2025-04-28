package com.myself.service;

import com.myself.dao.StudentDao;
import com.myself.dao.StudentDaoImpl;
import com.myself.pojo.Student;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/26 16:21
 */
public class StudentServiceImpl implements  StudentService {
    private StudentDaoImpl studentDao;

    public void setStudentDao(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.queryAll();
    }
}
