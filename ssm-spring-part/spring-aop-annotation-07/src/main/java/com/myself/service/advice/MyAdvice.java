package com.myself.service.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/30 19:44
 */
@Aspect
public class MyAdvice {

    @Before("execution(* com..impl.*.*(..))")
    public  void  before(){}
    @After("execution(* com..impl.*.*(..))")
    public  void  after(JoinPoint joinPoint){
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        int modifiers = joinPoint.getSignature().getModifiers();

    }
    @AfterReturning(value = "execution(* com..impl.*.*(..))",returning = "result")
    public  void  afterReturn(Object result){}
    @AfterThrowing(value = "execution(* com..impl.*.*(..))",throwing = "throwable")
    public  void  afterThrow(Throwable throwable){}


}
