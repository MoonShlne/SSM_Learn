package com.myself.service;

import com.myself.dao.XxxDao;
import com.myself.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 19:16
 */
@Service
public class XxxServiceImpl implements XxxService {
    @Autowired
    private XxxDao xxxDao;

    @Override
    public List<Student> findAll() {
        return xxxDao.findAll();
    }
}
