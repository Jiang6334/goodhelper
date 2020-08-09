package com.okgo.goodhelper.service;

import com.okgo.goodhelper.pojo.User;

import java.util.List;

public interface UserService {

    User queryUserByUserId(int user_id);
    List<User> queryUserList();
    List<User> selectUserIdByOpenId(String openId);
    boolean addUserInfoByUserId(User user);
    String  isOpenId(String openId);
    int addUser(User user);
    int addOpenId(String openId);

    //校友认证更新是认证为1
    void updateUserIsAlumni(int user_id);
}
