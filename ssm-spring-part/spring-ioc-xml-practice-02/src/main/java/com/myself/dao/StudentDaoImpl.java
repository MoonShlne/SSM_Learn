package com.myself.dao;

import com.myself.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/26 15:14
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,gender,age,class as classes from students";
        List<Student> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));

        System.out.println(query);
        return query;


    }
}
