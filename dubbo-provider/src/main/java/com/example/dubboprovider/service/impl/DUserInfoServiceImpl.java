package com.example.dubboprovider.service.impl;

import com.example.dubboprovider.entity.UserInfo;
import com.example.dubboprovider.service.DUserInfoService;
import com.example.dubboprovider.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

@com.alibaba.dubbo.config.annotation.Service
public class DUserInfoServiceImpl implements DUserInfoService {
    @Autowired
    UserInfoService userInfoService;
    @Override
    public UserInfo findByUsername(String username) {
        return userInfoService.findByUsername(username);
    }
}
