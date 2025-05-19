package com.myself.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/15 15:02
 */
@Data
@Component
@ConfigurationProperties(prefix = "user.userinfo")
public class User {

//    @Value("${user.userInfo.name}")
    private String name;
//    @Value("${user.userInfo.age}")
    private int age;
//    @Value("${user.userInfo.hobbies}")
    List<String> hobbies;
}
