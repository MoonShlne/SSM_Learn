package com.myself.test;

import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/19 14:42
 */
@SpringBootTest
public class MybatisPlusTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
