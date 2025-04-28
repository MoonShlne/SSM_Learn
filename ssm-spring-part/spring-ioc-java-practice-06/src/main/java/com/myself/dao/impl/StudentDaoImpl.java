package com.myself.dao.impl;

import com.myself.dao.StudentDao;
import com.myself.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Struct;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/28 13:58
 */
@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> findAll() {
        String sql ="select id,name,gender,age,class as classes from students";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Student.class));
    }
}
