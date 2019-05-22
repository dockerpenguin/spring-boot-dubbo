package com.example.dubboconsumer.web;


import com.example.dubboconsumer.service.UserInfoDubboService;
import com.example.dubboprovider.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserInfoDubboService userInfoService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserInfo getUser(@RequestParam String username) {
        UserInfo user = userInfoService.findByUsername(username);
        return user;
    }
}
