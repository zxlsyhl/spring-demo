package org.zxl.springdemo.test.springdaotest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zxl.springdemo.test.springdaotest.dao.IUserDAO;
import org.zxl.springdemo.test.springdaotest.dao.impl.UserDAO;
import org.zxl.springdemo.test.springdaotest.dao.impl.UserDAO2;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springdaobean.xml");

        IUserDAO iUserDAO = (UserDAO) context.getBean("userDAO");
        System.out.println(iUserDAO.queryAllUser().size());

        IUserDAO iUserDAO2 = (UserDAO2) context.getBean("userDAO2");
        System.out.println(iUserDAO2.queryAllUser().size());
    }
}
