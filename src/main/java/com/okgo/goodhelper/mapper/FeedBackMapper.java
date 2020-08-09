package com.okgo.goodhelper.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedBackMapper {
    void InsertFeedBack(@Param("article") String article, @Param("create_time") String create_time, @Param("user_id") Integer user_id);


}
