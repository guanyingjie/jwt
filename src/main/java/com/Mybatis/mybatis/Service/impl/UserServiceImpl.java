package com.Mybatis.mybatis.Service.impl;

import com.Mybatis.mybatis.Service.IUserService;
import com.Mybatis.mybatis.entity.User;
import com.Mybatis.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Primary
public class UserServiceImpl implements IUserService {
    //自动注解，usermapper 重写getalluser,addUser,deleteUser 方法，
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User>getAllUsers(){
        return userMapper.getALlUser();
    }

    @Override
    public int addUser(User user){
        //取日期数据
        SimpleDateFormat form= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        user.setCreateTime(form.format(new Date()));
        return  userMapper.addUser(user);
    }
    @Override
    public int deleteUser(User user){
        return userMapper.deleteUser(user);
    }
}
