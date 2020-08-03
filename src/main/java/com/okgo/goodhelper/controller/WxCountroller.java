package com.okgo.goodhelper.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.okgo.goodhelper.pojo.User;
import com.okgo.goodhelper.service.Impl.UserServiceImpl;
import com.okgo.goodhelper.utils.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
        System.out.println(code);
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
        System.out.println(result.toString());
        System.out.println(result.toString().split(":")[2].split("\"")[1]);
        String openId = result.toString().split(":")[2].split("\"")[1];
        if (!openId.equals("invalid code, hints")){
            userService.addOpenId(openId);
        }
        List<User> userList = userService.selectUserIdByOpenId(openId);

        return userList;
    }

    }

