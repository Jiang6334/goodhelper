package com.okgo.goodhelper.service;

import com.okgo.goodhelper.pojo.User;

import java.util.List;

public interface UserService {

    User queryUserByUserId(int user_id);
    List<User> queryUserList();
    List<User> selectUserIdByOpenId(String openId);
    String  isOpenId(String openId);
    int addUser(User user);
    int addOpenId(String openId);
}
