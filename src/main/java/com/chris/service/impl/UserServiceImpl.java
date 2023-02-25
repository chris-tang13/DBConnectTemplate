package com.chris.service.impl;

import com.chris.mapper.UserMapper;
import com.chris.pojo.Users;
import com.chris.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Users> findAll() {
        return userMapper.findAll();
    }
}
