package com.Mybatis.mybatis.controller;

import com.Mybatis.mybatis.Service.IUserService;
import com.Mybatis.mybatis.Service.impl.UserServiceImpl;
import com.Mybatis.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    //自动注解，service层，定义接口，和对应的函数
    @Autowired
    private IUserService iUserService;

    @GetMapping("/getAllUser")
    public List<User>getAllUser(){
        return iUserService.getAllUsers();
    }

    @PostMapping("addUser")
    public int addUser(@RequestBody User user){
        return iUserService.addUser(user);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestBody User user ){
         iUserService.deleteUser(user);
    }
}
