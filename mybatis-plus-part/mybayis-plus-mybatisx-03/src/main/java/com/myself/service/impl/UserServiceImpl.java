package com.myself.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myself.pojo.User;
import com.myself.service.UserService;
import com.myself.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author polar
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-05-21 19:33:58
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




