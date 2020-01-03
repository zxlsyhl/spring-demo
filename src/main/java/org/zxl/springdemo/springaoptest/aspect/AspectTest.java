package org.zxl.springdemo.springaoptest.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AspectTest {
    //指定切入点表达式，拦截那些方法，即为那些类生成代理对象
    //@Pointcut("execution(* com.bie.aop.UserDao.save(..))")  ..代表所有参数
    //@Pointcut("execution(* com.bie.aop.UserDao.*())")  指定所有的方法
    //@Pointcut("execution(* com.bie.aop.UserDao.save())") 指定save方法

    @Pointcut("execution(* org.zxl.springdemo.springaoptest.dao.UserDao.*(..))")
    public void pointCut2(){
    }

    @Before("pointCut2()")
    public void begin(){
        System.out.println("aop代理拦截，执行方法前");
    }
    @After("pointCut2()")
    public void end(){
        System.out.println("aop代理拦截，执行方法后");
    }
}
