package com.Mybatis.mybatis.mapper;

import com.Mybatis.mybatis.entity.User;

import java.util.List;

//DAO接口
public interface UserMapper {
    List<User>getALlUser();
    int addUser(User user);
    int deleteUser(User user);
}
