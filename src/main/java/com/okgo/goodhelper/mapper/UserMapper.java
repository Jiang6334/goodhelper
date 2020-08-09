package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    User queryUserByUserId(int user_id);
    List<User> queryUserList();
    //通过openId返回整个User到前端
    List<User> selectUserIdByOpenId(String openId);


    boolean addUserInfoByUserId(User user);

    //查询openId是否存在
    String isOpenId(String openId);

    int addUser(User user);

    int addOpenId(String openId);



    void updateUserIsAlumni(int user_id);
}
