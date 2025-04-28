package com.myself.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.myself.controller.StudentController;
import com.myself.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/26 14:04
 */
public class JdbcTemplateTest {

    public void testForJava() {
        DruidDataSource druidDataSource = new DruidDataSource();

        JdbcTemplate jdbcTemplate = new JdbcTemplate();

        //jdbcTemplate.update();
        //jdbcTemplate.query();
    }

    @Test
    public void testForIoC() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        JdbcTemplate bean = applicationContext.getBean(JdbcTemplate.class);

//         String sql = "insert into students values (?,?,?,?,?)";
//        int update = bean.update(sql, 9,"haha", "难", 11, "中专一班");
//
//        System.out.println(update);


        String sql = "select id,name,gender,age,class as classes from students";

        List<Student> query = bean.query(sql, new BeanPropertyRowMapper<Student>(Student.class));

        query.forEach(System.out::println);


    }

    @Test
    public void testQueryAll() {
        //1 创建ioc
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        //2 获取组件
        StudentController controller = applicationContext.getBean(StudentController.class);
        //3获取对象
        controller.findAll();

        //4关闭容器
        applicationContext.close();


    }

}
