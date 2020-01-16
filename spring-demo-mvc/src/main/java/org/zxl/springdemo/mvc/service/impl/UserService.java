package org.zxl.springdemo.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxl.springdemo.mvc.entity.User;
import org.zxl.springdemo.mvc.repository.UserMapper;
import org.zxl.springdemo.mvc.service.IUserService;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getList() {
        return userMapper.getList();
    }

    @Override
    public List<User> getList2() {
        return userMapper.getList2();
    }
}
