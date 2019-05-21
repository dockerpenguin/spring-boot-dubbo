package com.example.dubboprovider.repository;


import com.example.dubboprovider.base.BaseRepository;
import com.example.dubboprovider.entity.UserInfo;

public interface UserInfoRepository extends BaseRepository<UserInfo, Integer> {
    UserInfo findByUsername(String username);
}
