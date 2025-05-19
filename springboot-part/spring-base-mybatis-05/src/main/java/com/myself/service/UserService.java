package com.myself.service;

import com.myself.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/16 20:34
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Transactional
    public  int delete(){
        Integer delete = userMapper.delete(2);

        return  delete;
    }
}
