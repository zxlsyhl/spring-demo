package org.zxl.springdemo.mvc.repository;

import org.springframework.stereotype.Repository;
import org.zxl.springdemo.mvc.entity.User;

import java.util.List;

@Repository
public interface UserMapper {
    public List<User> getList();
    public List<User> getList2();
}
