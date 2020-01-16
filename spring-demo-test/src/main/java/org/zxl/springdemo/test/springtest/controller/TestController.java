package org.zxl.springdemo.test.springtest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.zxl.springdemo.test.springtest.service.TestService;

import javax.annotation.Resource;

public class TestController {
    @Autowired
    @Qualifier("testServiceHome")
    private TestService testService;

    @Resource(name = "testServiceSchool")
    private TestService testService2;

    @Resource(name = "testServiceCompany")
    private TestService testService3;

    public void goSchool(){
        System.out.println(testService.returnNum());
        System.out.println(testService2.returnNum());
        System.out.println(testService3.returnNum());
    }
}
