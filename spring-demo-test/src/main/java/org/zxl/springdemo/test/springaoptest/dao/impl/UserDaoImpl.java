package org.zxl.springdemo.test.springaoptest.dao.impl;

import org.zxl.springdemo.test.springaoptest.dao.UserDao;


public class UserDaoImpl implements UserDao {
    private int userId;
    @Override
    public int getUserId() {
        System.out.println("获取userId："+userId);
        return userId;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
