package com.Mybatis.mybatis.Service;

import com.Mybatis.mybatis.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    int addUser(User user);
    int deleteUser(User user);

}
