package org.zxl.springdemo.test.springaoptest.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zxl.springdemo.test.springaoptest.config.SpringaoptestConfigure;
import org.zxl.springdemo.test.springaoptest.dao.UserDao;

/**
 * 参考https://www.cnblogs.com/biehongli/p/6640406.html
 */
public class AopTest {
    ApplicationContext context  = new AnnotationConfigApplicationContext(SpringaoptestConfigure.class);
    @Test
    public void aopTest(){
        UserDao dao = (UserDao) context.getBean("userDaoImplAop");
        System.out.println(dao.getClass());
        dao.setUserId(1);
    }
}
