package com.csc.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csc.api.entity.User;
import com.csc.api.mapper.UserMapper;
import com.csc.api.service.UseService;

@Service
public class UserServiceImpl implements UseService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUsername(String userName) {
        return userMapper.findByUsername(userName);
    }
}