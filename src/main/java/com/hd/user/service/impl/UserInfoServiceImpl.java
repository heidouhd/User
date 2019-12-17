package com.hd.user.service.impl;

import com.hd.user.domain.User;
import com.hd.user.mapper.UserMapper;
import com.hd.user.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}
