package org.zxl.springdemo.test.springtest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.zxl.springdemo.test.springtest.controller.TestController;

@Configuration
@ComponentScan(basePackages = "org.zxl.springdemo.test.springtest")
public class TestConfigure {
//    @Bean
//    public TestService testService(){
//        return new TestServiceSchool();
//    }
//
//    @Bean
//    public TestService testService1(){
//        return new TestServiceHome();
//    }

    @Bean
    public TestController testController(){
        return new TestController();
    }
}
