package com.okgo.goodhelper.controller;

import com.okgo.goodhelper.pojo.wxJSONResult;
import com.okgo.goodhelper.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("Hello")
    public User hello(){
        User user = new User();
        user.setWx_name("栋322");
        user.setCity("河南23");
        user.setCountry("中国2");
        return user;
    }
    @RequestMapping("getJSONUser")
    public wxJSONResult getJSONUser(){
        User user = new User();
        user.setWx_name("12");
        user.setCity("河南");
        user.setCountry("中国");
        return wxJSONResult.ok(user);
    }
}
