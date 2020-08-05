package com.okgo.goodhelper.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okgo.goodhelper.pojo.User;
import com.okgo.goodhelper.service.Impl.UserServiceImpl;
import com.okgo.goodhelper.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class WxCountroller {
    private String appID = "wx0900b61a6d4c00cf";
    private String appSecret = "74eb5854356dacca532423091b43a5c1";

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/user/login")
    public List<User> userLogin(String code) throws IOException {

        List<User> userList;
        System.out.println("请求开始的code:"+code);
        String result = "";
        try{//请求微信服务器，用code换取openid。HttpUtil是工具类，后面会给出实现，Configure类是小程序配置信息，后面会给出代码
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + this.appID + "&secret="
                            + this.appSecret + "&js_code="
                            + code
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("请求微信服务器返回的result:"+result.toString());
        System.out.println("截取的openId:"+result.toString().split(":")[2].split("\"")[1]);
        String openId = result.toString().split(":")[2].split("\"")[1];

        // 判断openId是否在数据中存在，若存在，则返回user_id,若不存在，则插入openId再返回user_id
        if (!openId.equals("invalid code, hints")&userService.isOpenId(openId).equals("0")){
            userService.addOpenId(openId);
        }

        userList = userService.selectUserIdByOpenId(openId);

        return userList;
    }


    @PutMapping("/user/addUserInfo")
    public boolean addUserInfo(User user){

        System.out.println("信息返回的user:"+user);
        return true;


    }

    }

