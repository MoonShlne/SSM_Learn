package com.myself.service;

import com.myself.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Transactional(timeout = 3)
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    /**
     * @transactional 加载类上 所有方法生效
     * 方法上方法生效
     */
    public void changeInfo() throws FileNotFoundException {
        studentDao.updateAgeById(22, 1);
        new FileInputStream("11");
        System.out.println("-----------");
        studentDao.updateNameById("test2", 1);
    }
}
