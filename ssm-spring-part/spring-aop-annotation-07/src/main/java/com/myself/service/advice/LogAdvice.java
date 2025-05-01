package com.myself.service.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/30 16:02
 */
@Component
@Aspect
public class LogAdvice {
    @Before("execution(* com.myself.service.impl.*.*(..))")
    public void start() {
        System.out.println("starting ....");
    }

    @After("execution(* com.myself.service.impl.*.*(..))")
    public void end() {
        System.out.println("ending ......");
    }

    @AfterThrowing("execution(* com.myself.service.impl.*.*(..))")
    public void error() {
        System.out.println("error !!!!!!");
    }
}
