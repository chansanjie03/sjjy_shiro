package com.sjjy.controller;

import com.alibaba.fastjson.JSON;
import com.sjjy.entity.User;
import com.sjjy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Copyright (C), 2019,陈圣杰教育科技有限公司
 * FileName: UserController
 * Author:   chenshengjie (csj)
 * Date:     2019/5/27 20:10
 */

@RestController
@RequestMapping("/user")
@Validated
@Api(value = "USER", description = "测试UserController")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/login",method={RequestMethod.GET })
    @ApiOperation(value = "查询个人信息接口",notes = "查询个人信息接口")
    public String login(User user){
        System.out.println("用户登录中....");
        User login = userService.login(user);
        String result = JSON.toJSONString(login);
        return result;
    }

}
