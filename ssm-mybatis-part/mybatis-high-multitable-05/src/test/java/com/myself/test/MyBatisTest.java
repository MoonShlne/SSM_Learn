package com.myself.test;

import com.myself.mapper.CustomerMapper;
import com.myself.mapper.OrderMapper;
import com.myself.pojo.Customer;
import com.myself.pojo.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/5 14:17
 */
public class MyBatisTest {
    private  SqlSession session;
    @BeforeEach
    public void  getSqlSession() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        session = build.openSession();

    }


    @Test
    public void testOne() {
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Order order = mapper.
                queryOrderById(1);
        System.out.println(order);


    }
    @Test
    public void testMany() {
        CustomerMapper mapper = session.getMapper(CustomerMapper.class);
        List<Customer> customers = mapper.queryList();
        customers.forEach(System.out::println);
        int count =1    ;
        for (Customer c: customers){
            System.out.println("第"+ count+"个客户");
            c.getOrderList().forEach(System.out::println);
            count++;
        }


    }

    @AfterEach
    public void  clean(){
        session.close();
    }

}
