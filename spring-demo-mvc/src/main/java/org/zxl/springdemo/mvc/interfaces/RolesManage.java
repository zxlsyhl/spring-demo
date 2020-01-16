package org.zxl.springdemo.mvc.interfaces;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Target(ElementType.METHOD) //目标是方法
@Retention(RetentionPolicy.RUNTIME)//注解会在class中存在，运行时可通过反射获取
@Documented
public @interface RolesManage {

    public String roles() default "";
}
