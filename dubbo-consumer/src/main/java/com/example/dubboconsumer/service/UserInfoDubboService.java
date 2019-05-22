package com.example.dubboconsumer.service;


import com.example.dubboprovider.entity.UserInfo;

public interface UserInfoDubboService  {

    UserInfo findByUsername(String username);

}
