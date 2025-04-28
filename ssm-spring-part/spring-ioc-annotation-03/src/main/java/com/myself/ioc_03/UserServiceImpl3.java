package com.myself.ioc_03;

import org.springframework.stereotype.Service;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/27 16:42
 */
@Service
public class UserServiceImpl3 implements UserService {
    @Override
    public void show() {
        System.out.println(333);
    }
}
