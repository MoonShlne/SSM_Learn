package com.myself.test;

import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/21 16:37
 */
@SpringBootTest
public class SyscTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void test(){
        //步骤1: 先查询,在更新 获取version数据
        //同时查询两条,但是version唯一,最后更新的失败
        User user  = userMapper.selectById(5);
        User user1  = userMapper.selectById(5);

        user.setAge(20);
        user1.setAge(30);

        userMapper.updateById(user);
        //乐观锁生效,失败!
        userMapper.updateById(user1);

    }
}
