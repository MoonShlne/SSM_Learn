package com.myself.service.impl;

import com.myself.dao.StudentDao;
import com.myself.pojo.Student;
import com.myself.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 13:56
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
