package com.example.dubboprovider.service.impl;

import com.example.dubboprovider.base.BaseServiceImpl;
import com.example.dubboprovider.entity.UserInfo;
import com.example.dubboprovider.repository.UserInfoRepository;
import com.example.dubboprovider.service.UserInfoService;
import org.springframework.stereotype.Service;

@com.alibaba.dubbo.config.annotation.Service
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo, Integer, UserInfoRepository> implements UserInfoService {

    @Override
    public UserInfo findByUsername(String username) {
        return getRepository().findByUsername(username);
    }
}
