package com.myself.UserCurdTest;

;
import com.myself.mapper.UserMapper;
import com.myself.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/4 16:38
 */
public class CrudTest {
    @Test
    public void testInsert() throws IOException {

        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = build.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("haha");
        user.setPassword("2345");
        System.out.println(user.getId());
        int insert = mapper.insert(user);
        System.out.println(user.getId());
        sqlSession.close();
    }

    @Test
    public void testDelete() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = build.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int delete = mapper.delete(1);

        System.out.println(delete);

        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = build.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("张小三");
        user.setPassword("99999");
        user.setId(2);

        mapper.update(user);
    }

    @Test
    public void testSelect() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);

        SqlSession sqlSession = build.openSession(true);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = mapper.selectAll();
        users.forEach(System.out::println);

        sqlSession.close();
    }


}
