package org.zxl.springdemo.springtest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.zxl.springdemo.springtest.config.TestConfigure;
import org.zxl.springdemo.springtest.controller.TestController;

public class CoreTestConfigure {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfigure.class);
        TestController testController = (TestController) context.getBean("testController");
        testController.goSchool();
//        int a =0;
//        while (a==0){
//            Scanner scanner = new Scanner(System.in);
//            a = scanner.nextInt();
//        }

        System.out.println("end");
    }
}
