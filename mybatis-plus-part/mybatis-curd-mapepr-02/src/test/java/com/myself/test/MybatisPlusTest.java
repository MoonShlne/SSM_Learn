package com.myself.test;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/19 19:14
 */
@SpringBootTest
public class MybatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setAge(11);
        user.setName("haha");
        user.setEmail("1112@sdfd");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void testDelete() {
        int i = userMapper.deleteById(1924423885269344258L);
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "tom");
        userMapper.deleteByMap(map);
    }

    @Test
    public void testPage() {
        Page<User> page = new Page<>(1, 3);
        System.out.println(userMapper.selectPage(page, null));
    }

    @Test
    public void testSelfPage(){
        Page<User> userPage = new Page<>(1,1);
        IPage<User> userIPage = userMapper.queryAge(userPage, 19);
        System.out.println(userIPage.getPages());
        System.out.println(userPage.getRecords());

    }
}
