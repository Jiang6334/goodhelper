package com.okgo.goodhelper.service.Impl;

import com.okgo.goodhelper.mapper.UserMapper;
import com.okgo.goodhelper.pojo.User;
import com.okgo.goodhelper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByUserId(int user_id) {
        return null;
    }

    @Override
    public List<User> queryUserList() {

        return null;
    }

    @Override
    public List<User> selectUserIdByOpenId(String openId) {
        List<User> userList = userMapper.selectUserIdByOpenId(openId);
        for (User user : userList){
            System.out.println(user);
        }
        System.out.println("user_id的值："+userList.get(0));
        return userList;
    }

    @Override
    public boolean addUserInfoByUserId(User user) {

        boolean is = userMapper.addUserInfoByUserId(user);
        return is;
    }

    @Override
    public String isOpenId(String openId) {
        if (userMapper.isOpenId(openId) != null){
            System.out.println(userMapper.isOpenId(openId));
            return "1";
        }
        return "0";
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int addOpenId(String openId) {
        return userMapper.addOpenId(openId);
    }
}
