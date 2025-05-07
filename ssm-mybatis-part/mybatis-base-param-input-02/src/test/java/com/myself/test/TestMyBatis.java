package com.myself.test;

import com.myself.mapper.EmployeeMapper;
import com.myself.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/3 13:29
 */
public class TestMyBatis {

    @Test
    public void test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.queryById(1);

        System.out.println(employee);


    }

    @Test
    public void test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        int iWillAway = mapper.insertUser(new Employee(1, "i will away", 1111.1));

        System.out.println(iWillAway);

        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.queryBySalary(1111.1);
        employees.forEach(System.out::println);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employees = mapper.queryByNameAndSalary("nihao", 1111.1);

        employees.forEach(System.out::println);


        sqlSession.commit();
        sqlSession.close();
    }
}
