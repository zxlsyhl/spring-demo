package org.zxl.springdemo.test.springdaotest.dao;

import org.zxl.springdemo.test.springdaotest.model.User;

import java.util.List;

public interface IUserDAO {
    public List<User> queryAllUser();
    public boolean addUser(int userId, String userName, int money);
}
