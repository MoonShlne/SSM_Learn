package com.myself.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author polar
 * @version 1.0
 * @since 2025/5/16 20:42
 */
@Aspect
@Component
public class LogAdvice {
    @Before("execution(* com..service.*.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("LogAdvice.before");
        System.out.println("joinPoint = " + joinPoint);
    }
}
