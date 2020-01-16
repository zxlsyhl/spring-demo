package org.zxl.springdemo.mvc.entity;

import org.zxl.springdemo.mvc.enums.UserSex;

public class User {
    private int userId;
    private String userName;
    private  int money;
    private UserSex sex;

    public UserSex getSex() {
        return sex;
    }

    public void setSex(UserSex sex) {
        this.sex = sex;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
