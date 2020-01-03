package org.zxl.springdemo.springtest.config;

import org.zxl.springdemo.springtest.controller.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.zxl.springdemo.springtest")
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
