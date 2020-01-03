package org.zxl.springdemo.springtest.service.impl;

import org.springframework.stereotype.Service;
import org.zxl.springdemo.springtest.service.TestService;

@Service("testServiceSchool")
public class TestServiceSchool implements TestService {
    @Override
    public int returnNum() {
        return 0;
    }

    @Override
    public int getHeart() {
        return 0;
    }

    @Override
    public void setHeart(int heart) {

    }
}
