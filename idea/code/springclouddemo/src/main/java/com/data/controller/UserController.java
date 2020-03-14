package com.data.controller;

import com.data.entity.UserInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String index(){
        UserInfo userInfo = new UserInfo(1,"Jack","male",23);
        return userInfo.toString();
    }
}
