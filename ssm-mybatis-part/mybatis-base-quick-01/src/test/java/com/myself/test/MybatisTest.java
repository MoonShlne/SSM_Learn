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

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/2 14:51
 */
public class MybatisTest {

    @Test
    public void test() throws IOException {


        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = sessionFactory.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.selectEmployee(1);

        System.out.println(employee);
        sqlSession.commit();
        sqlSession.close();


    }
}
