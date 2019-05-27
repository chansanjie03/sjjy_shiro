package com.sjjy.service.impl;

import com.sjjy.entity.User;
import com.sjjy.mapper.UserMapper;
import com.sjjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2019,陈圣杰教育科技有限公司
 * FileName: UserServiceImpl
 * Author:   chenshengjie (csj)
 * Date:     2019/5/27 20:09
 */

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        User userById = userMapper.findUserById("1");
        System.out.println(userById.toString());
        return userById;
    }
}
