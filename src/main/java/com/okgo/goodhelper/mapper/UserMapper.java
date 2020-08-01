package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    User queryUserByUserId(int user_id);
    List<User> queryUserList();
}
