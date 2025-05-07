package com.myself.testReturnType;

import com.myself.mapper.EmployeeMapper;
import com.myself.mapper.TeacherMapper;
import com.myself.pojo.Employee;
import com.myself.pojo.Teacher;
import org.apache.ibatis.builder.SqlSourceBuilder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/3 15:32
 */
public class testType {

    @Test
    public  void  test1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        String s = mapper.queryById(8);
        System.out.println(s);

        sqlSession.commit();
        sqlSession.close();



    }


    @Test
    public  void  test2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = mapper.queryEmployeeById(1);

        System.out.println(employee);

        sqlSession.close();


    }


    @Test
    public  void  test3() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Map<String, Objects> stringObjectsMap = mapper.selectEmpNameAndMaxSalary();
        System.out.println(stringObjectsMap);

        sqlSession.close();


    }

    @Test
    public  void  test4() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession();

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        List<Employee> employees = mapper.queryAll();
        System.out.println(employees);
    }

    @Test
    public  void  test5() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession(true);

        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(null,"piggy",0.01);
        System.out.println(employee.getEmpId());
        int piggy = mapper.insertEmp(employee);
        System.out.println(employee.getEmpId());

        sqlSession.close();

    }

    @Test
    public  void  test6() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);

        SqlSession sqlSession = build.openSession(true);

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
//        String uuid = UUID.randomUUID().toString().replace("-","");;
//        teacher.settId(uuid);
        System.out.println(teacher.gettId());
        teacher.settName("rabbitter");
        mapper.insertTeacher(teacher);
        System.out.println(teacher.gettId());
        sqlSession.close();

    }
}
