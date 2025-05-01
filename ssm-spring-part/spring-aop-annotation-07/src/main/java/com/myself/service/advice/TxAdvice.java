package com.myself.service.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.crypto.interfaces.PBEKey;
import java.security.PublicKey;

/**
 * @author polar
 * @version 1.0
 * @since 2025/4/30 20:40
 */
@Aspect
@Component
@Order(1)
public class TxAdvice {
    @Before("com.myself.service.pointcut.MyPointCut.pc()")
    public  void  begin(){
        System.out.println("事务开始");
    }
        @AfterReturning("com.myself.service.pointcut.MyPointCut.pc()")
    public  void  commit(){
            System.out.println("事务结束");
        }
    @AfterThrowing("com.myself.service.pointcut.MyPointCut.pc()")
    public  void  rollBack(){
        System.out.println("事务回滚");
    }

}
