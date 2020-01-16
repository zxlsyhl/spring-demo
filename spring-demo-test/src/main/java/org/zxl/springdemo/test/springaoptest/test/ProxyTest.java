package org.zxl.springdemo.test.springaoptest.test;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.zxl.springdemo.test.springaoptest.dao.UserDao;
import org.zxl.springdemo.test.springaoptest.dao.impl.UserDaoImpl;
import org.zxl.springdemo.test.springaoptest.dao.impl.UserDaoImpl2;
import org.zxl.springdemo.test.springaoptest.dao.impl.UserDaoImpl3;

public class ProxyTest {

    /**
     * jdk代理验证，使用 JDK 生成的动态代理的前提是目标类必须有实现的接口。
     * com.sun.proxy
     */
    @Test
    public void jdkproxyRight() {
        UserDao target = new UserDaoImpl();
        System.out.println("目标对象："+target.getClass());
        UserDao proxy = (UserDao) new ProxyFactory(target).getProxy();
        System.out.println("代理对象，"+proxy.getClass());
        proxy.getUserId();
    }

    /**
     * dk代理验证，使用 JDK 生成的动态代理的前提是目标类不能是接口的实现类。
     */
    @Test
    public void jdkproxyWrong() {
        UserDaoImpl target = new UserDaoImpl();
        System.out.println("目标对象："+target.getClass());
        UserDaoImpl proxy = (UserDaoImpl) new ProxyFactory(target).getProxy();
        System.out.println("代理对象，"+proxy.getClass());
        proxy.getUserId();
    }

    /**
     * CGLIB代理验证，目标类是无接口的实现类时，会使用CGLIB代理生成代理对象。
     * UserDaoImpl2$$EnhancerBySpringCGLIB$$e4c3c8bf
     */
    @Test
    public void cglibProxy() {
        UserDaoImpl2 target = new UserDaoImpl2();
        System.out.println("目标对象："+target.getClass());
        UserDaoImpl2 proxy = (UserDaoImpl2) new ProxyFactory(target).getProxy();
        System.out.println("代理对象，"+proxy.getClass());
        proxy.getUserId();
    }

    /**
     * CGLIB代理验证，使用的前提是目标类不能为 final 修饰。因为 final 修饰的类不能被继承。
     * UserDaoImpl2$$EnhancerBySpringCGLIB$$e4c3c8bf
     */
    @Test
    public void cglibProxyWrong() {
        UserDaoImpl3 target = new UserDaoImpl3();
        System.out.println("目标对象："+target.getClass());
        UserDaoImpl3 proxy = (UserDaoImpl3) new ProxyFactory(target).getProxy();
        System.out.println("代理对象，"+proxy.getClass());
        proxy.getUserId();
    }
}
