package com.myself.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/30 15:32
 */
@Configuration
@ComponentScan("com.myself.service")
@EnableAspectJAutoProxy
public class JavaConfig {


}
