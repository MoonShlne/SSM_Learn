package com.myself.ioc_03;

import org.springframework.stereotype.Service;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 15:20
 */
@Service
public class UserServiceImpl implements UserService {
    public  void  show(){
        System.out.println(111);
    };
}
