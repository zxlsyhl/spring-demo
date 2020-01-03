package org.zxl.springdemo.springtest.service.impl;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.zxl.springdemo.springtest.service.TestService;

@Service
@Scope(ConfigurableListableBeanFactory.SCOPE_PROTOTYPE)
public class TestServiceHome implements TestService {
    @Override
    public int returnNum() {
        return 100;
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
