package com.myself.dao;

import com.myself.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 19:17

 */
@Repository
public class XxxDaoImpl implements XxxDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Student> findAll() {
        String sql = "SELECT id,name,gender,age,class as classes from students";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));

    }
}
