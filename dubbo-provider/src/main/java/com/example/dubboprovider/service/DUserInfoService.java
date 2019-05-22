package com.example.dubboprovider.service;

import com.example.dubboprovider.entity.UserInfo;

public interface DUserInfoService {
    UserInfo findByUsername(String username);
}
