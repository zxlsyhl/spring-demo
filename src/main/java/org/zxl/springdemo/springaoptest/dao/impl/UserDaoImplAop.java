package org.zxl.springdemo.springaoptest.dao.impl;

import org.springframework.stereotype.Component;
import org.zxl.springdemo.springaoptest.dao.UserDao;

@Component
public class UserDaoImplAop implements UserDao {
    @Override
    public int getUserId() {
        return 0;
    }

    @Override
    public void setUserId(int userId) {
        System.out.println("设置成功");
    }
}
