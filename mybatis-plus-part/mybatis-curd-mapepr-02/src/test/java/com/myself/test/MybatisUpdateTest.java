package com.myself.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/21 13:40
 */
@SpringBootTest
public class MybatisUpdateTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
//    update wrapper
        UpdateWrapper<User> userUpdateWrapper = new UpdateWrapper<>();
        userUpdateWrapper.
                ge("age", 3).
                like("name", "a").
                or().
                eq("email", null).set("email",null).set("age",999);

        userMapper.update(userUpdateWrapper);

//query wrapper
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.
                ge("age", 3).
                like("name", "a").
                or().
                eq("email", null);
    }

}
