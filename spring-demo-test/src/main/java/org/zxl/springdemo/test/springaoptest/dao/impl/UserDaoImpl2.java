package org.zxl.springdemo.test.springaoptest.dao.impl;

public class UserDaoImpl2 {
    private int userId;

    public int getUserId() {
        System.out.println("获取userId："+userId);
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }
}
