package com.okgo.goodhelper.controller;


import com.okgo.goodhelper.mapper.UserMapper;
import com.okgo.goodhelper.pojo.User;

import com.okgo.goodhelper.service.UserService;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    //测试查询所有User表中的数据
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user : userList){
            System.out.println(user);
        }
        return userList;
    }

    //登录页面，添加用户
    @PostMapping("/login")
    public boolean login(User user,String jsCode){





        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        user.setCreate_time(new Date());
        user.setUpdate_time(new Date());
        int count = userService.addUser(user); // count表示插入的行数，打印的插入0行
        System.out.println(count); // TODO 换用log
        if (count>=1)
            return true;
        else
            return false;
    }




    }
