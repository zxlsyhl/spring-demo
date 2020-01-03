package org.zxl.springdemo.springtest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zxl.springdemo.springtest.config.TestConfigure;
import org.zxl.springdemo.springtest.service.TestService;
import org.zxl.springdemo.springtest.service.impl.TestServiceCompany;
import org.zxl.springdemo.springtest.service.impl.TestServiceHome;

/**
 * 测试Scope作用域的影响：
 * Spring 定义了多种作用域，可以基于这些作用域创建 Bean，包括：
 *
 * 单例(Singleton)：在整个应用中，只创建 Bean 的一个实例。
 * 原型(Prototype)：每次注入或者通过 Spring 应用上下文获取的时候，都会创建一个新的 Bean 实例。
 * 会话(Session): 在 Web 应用中，为每个会话创建一个 Bean 实例。
 * 请求(Request)：在 Web 应用中，为每个请求创建一个 Bean 实例。
 * 单例是默认的作用域。如果选择其他的作用域，要使用 @Scope 注解，他可以与 @Component 或者 @Bean 一起使用。
 *
 */
public class ScopeTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfigure.class);
        TestService testService1 = (TestServiceCompany) context.getBean("testServiceCompany");
        System.out.println("test1 start");
        System.out.println("第一次获取bean中属性值："+testService1.getHeart());
        testService1.setHeart(199);
        System.out.println("设置bean中的属性值");
        TestService testService2 = (TestServiceCompany) context.getBean("testServiceCompany");
        System.out.println("第一次获取bean中属性值："+testService2.getHeart());
        System.out.println("test1 end");
        System.out.println("**********************************************************************************");
        TestService testService3 = (TestServiceHome) context.getBean("testServiceHome");
        System.out.println("test2 start");
        System.out.println("第一次获取bean中属性值："+testService3.getHeart());
        testService1.setHeart(199);
        System.out.println("设置bean中的属性值");
        TestService testService4 = (TestServiceHome) context.getBean("testServiceHome");
        System.out.println("第一次获取bean中属性值："+testService4.getHeart());
        System.out.println("test2 end");

    }
}
