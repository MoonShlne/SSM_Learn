package com.myself.service.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/30 20:36
 */
@Component
public class MyPointCut {
    @Pointcut("execution(* com..impl.*.*(..))")
    public void  pc(){}

}
