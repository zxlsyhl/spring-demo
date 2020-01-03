package org.zxl.springdemo.springdaotest.dao;

import org.zxl.springdemo.springdaotest.model.User;

import java.util.List;

public interface IUserDAO {
    public List<User> queryAllUser();
    public boolean addUser(int userId, String userName, int money);
}
