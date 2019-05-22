package com.example.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboconsumer.service.UserInfoDubboService;
import com.example.dubboprovider.entity.UserInfo;
import com.example.dubboprovider.service.DUserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoDubboServiceImpl implements UserInfoDubboService {
    @Reference
    DUserInfoService userInfoService;

    @Override
    public UserInfo findByUsername(String username) {
        UserInfo userInfo = userInfoService.findByUsername(username);
        return userInfo;
    }
}
