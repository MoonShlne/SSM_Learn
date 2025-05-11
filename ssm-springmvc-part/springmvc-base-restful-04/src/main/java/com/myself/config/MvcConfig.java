package com.myself.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/10 13:22
 */
@Configuration
@ComponentScan("com.myself")
@EnableWebMvc
public class MvcConfig {

}
