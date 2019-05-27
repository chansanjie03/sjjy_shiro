package com.sjjy.controller;

import com.alibaba.fastjson.JSON;
import com.sjjy.entity.User;
import com.sjjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C), 2019,陈圣杰教育科技有限公司
 * FileName: UserController
 * Author:   chenshengjie (csj)
 * Date:     2019/5/27 20:10
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        System.out.println("用户登录中....");
        User login = userService.login(user);
        String result = JSON.toJSONString(login);
        return result;
    }

}
