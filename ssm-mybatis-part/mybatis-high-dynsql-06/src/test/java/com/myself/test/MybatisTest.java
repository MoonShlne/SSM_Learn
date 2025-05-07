package com.myself.test;

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
    public void testWhereIf() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.queryList(null, 101.0);
        employees.forEach(System.out::println);
    }

    @Test
    public void testSet() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setEmpName(null);
        employee.setEmpSalary(666.6);
        int i = mapper.updateEmp(employee);
        System.out.println(i);
    }

    //批量查询
    @Test
    public void testBulkQuery() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        List<Employee> employees = mapper.queryByListId(integers);
        employees.forEach(System.out::println);
    }

    //批量增加
    @Test
    public void testBulkDelete() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(11);
        integers.add(15);

        int i = mapper.deleteByListId(integers);

        System.out.println(i);

    }

    //批量增加
    @Test
    public void testBulkInsert() {
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(null,"都爱好防溺水",1234.6));
        employees.add(new Employee(null,"中穿第一房",12.6));
        employees.add(new Employee(null,"大无畏的发",1.1));
        int i = mapper.insertByListId(employees);
        System.out.println(i);

    }

    //批量修改
    @Test
    public  void  testBulkUpdate(){
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(6,"都爱好防溺水",1234.6));
        employees.add(new Employee(7,"中穿第一房",12.6));
        employees.add(new Employee(8,"大无畏的发",1.1));

        int i = mapper.updateByListId(employees);
        System.out.println(i);
    }

    @AfterEach
    public void clean() {
        session.close();
    }

}
