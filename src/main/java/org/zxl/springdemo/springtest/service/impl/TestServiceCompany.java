package org.zxl.springdemo.springtest.service.impl;

import org.springframework.stereotype.Component;
import org.zxl.springdemo.springtest.service.TestService;

@Component
public class TestServiceCompany implements TestService {
    @Override
    public int returnNum() {
        return 555;
    }

    private int heart;

    @Override
    public int getHeart() {
        return heart;
    }

    @Override
    public void setHeart(int heart) {
        this.heart = heart;
    }
}
