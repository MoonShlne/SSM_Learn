package com.myself.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.myself.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/19 19:14
 */
public interface UserMapper extends BaseMapper<User> {
    IPage<User> queryAge(IPage<User> page,@Param("age") Integer age);
}
