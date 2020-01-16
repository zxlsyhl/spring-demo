package org.zxl.springdemo.test.springtest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zxl.springdemo.test.springtest.controller.TestController;

public class CoreTestXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        TestServiceSchool testServiceSchool = (TestServiceSchool) context.getBean("testService");
//        System.out.println(testServiceSchool.returnNum());
        TestController testController = (TestController) context.getBean("testController");
        testController.goSchool();

    }
}
