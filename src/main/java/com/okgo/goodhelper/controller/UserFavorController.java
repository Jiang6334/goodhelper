package com.okgo.goodhelper.controller;

import com.okgo.goodhelper.pojo.UserFavor;
import com.okgo.goodhelper.service.Impl.UserFavorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFavorController {

    @Autowired
    private UserFavorServiceImpl userFavorService;


    @GetMapping("insertUserFavor")
    public String insertUserFavor(UserFavor userFavor){

//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
//        alumni.setCreateTime(df.format(new Date()));
        int count = userFavorService.insertUserFavor(userFavor);
        System.out.println(count);
        if (count>1)
            return "1";
        else
            return "0";
    }

}
