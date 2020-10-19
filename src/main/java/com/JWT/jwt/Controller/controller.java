package com.JWT.jwt.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {


    @GetMapping("/public")
    public String getPublicMessage(){
        return "this is not private message";
    }
    @GetMapping("/private")
    public String getPrivateMessage(){
        return "this is private message";
    }


}
