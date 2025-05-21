package com.myself.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.naming.Name;
import java.sql.Wrapper;
import java.util.Scanner;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/20 17:41
 */
@SpringBootTest
public class QueryWrapperTest {
    @Autowired
    private UserMapper userMapper;

    //测试wrapper
    @Test
    public void test() {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//    userQueryWrapper.ne("email",null);
        userQueryWrapper.isNotNull("email").between("age", 20, 25);
        userQueryWrapper.like("name", "a");
        userMapper.selectList(userQueryWrapper);
    }

    @Test
    public void testSort() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("age");
        System.out.println(userMapper.selectList(wrapper));

    }

    //测试 逻辑查询
    @Test
    public void testQuery() {
        //查询用户名为  name  age>x 的用户
        String name = "Jone";
        Integer age = 3;

        QueryWrapper<User> wrapper = new QueryWrapper<>();
//        if (StringUtils.isNotBlank(name)){
//            wrapper.eq("name",name);
//        }
//        if (age !=0 ){
//            wrapper.ge("age",age);
//        }
        wrapper.eq(StringUtils.isNotBlank(name), "name", name);
        wrapper.ge(age != 0, "age", age);
        System.out.println(userMapper.selectList(wrapper));



    }

}

