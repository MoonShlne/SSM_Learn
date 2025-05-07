package com.myself.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.myself.mapper.EmployeeMapper;
import com.myself.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 17:08
 */
public class MybatisTest {
    private SqlSession session;

    @BeforeEach
    public void getSqlSession() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        session = build.openSession(true);

    }

    @Test
    public void pagePlusTest() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);

        //调用之前 设置分页数据
        PageHelper.startPage(1, 2);
        List<Employee> employees = mapper.queryList();
        System.out.println(employees);

        PageInfo<Employee> employeePageInfo = new PageInfo<>(employees);

        System.out.println(employeePageInfo);

    }

    @AfterEach
    public void clean() {
        session.close();
    }

}
