package com.example.dubboprovider.web;


import com.example.dubboprovider.entity.UserInfo;
import com.example.dubboprovider.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class JpaUserController {

    @Resource
    UserInfoService userInfoService;

    @RequestMapping("/list")
    public List<UserInfo> list() {
        List<UserInfo> users = userInfoService.findAll();
        return users;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserInfo getUser(@RequestParam String username) {
        UserInfo user = userInfoService.findByUsername(username);
        return user;
    }
}
