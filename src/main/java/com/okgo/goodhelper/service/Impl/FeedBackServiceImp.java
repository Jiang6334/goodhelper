package com.okgo.goodhelper.service.Impl;

import com.okgo.goodhelper.mapper.FeedBackMapper;
import com.okgo.goodhelper.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeedBackServiceImp implements FeedBackService {
    @Autowired
    private  FeedBackMapper feedBackMapper;

    @Override
    public void InsertFeedBack(String article, String create_time, Integer user_id) {
        feedBackMapper.InsertFeedBack(article,create_time,user_id);

    }
}
