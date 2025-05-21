package com.myself.test;

import com.myself.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/21 19:18
 */
@SpringBootTest
public class TestQuick {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        userMapper.delete(null);

    }
}
