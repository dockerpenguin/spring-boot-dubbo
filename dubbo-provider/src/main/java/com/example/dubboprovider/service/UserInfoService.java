package com.example.dubboprovider.service;


import com.example.dubboprovider.base.BaseService;
import com.example.dubboprovider.entity.UserInfo;
import com.example.dubboprovider.repository.UserInfoRepository;

public interface UserInfoService extends BaseService<UserInfo, Integer, UserInfoRepository> {

    UserInfo findByUsername(String username);

}
