package com.okgo.goodhelper.service.Impl;

import com.okgo.goodhelper.mapper.GoodMapper;
import com.okgo.goodhelper.pojo.Good;
import com.okgo.goodhelper.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {


    @Autowired
    private GoodMapper goodMapper;

    @Override
    public int selectXinazhiAmountByUserId(Integer user_id) {

        return goodMapper.selectXinazhiAmountByUserId(user_id);
    }

    @Override
    public boolean updateGoodStatus(Integer good_id, String status) {
        return goodMapper.updateGoodStatus(good_id,status);
    }

    @Override
    public List<Good> selectGoodList(Integer user_id) {
        return goodMapper.selectGoodList(user_id);
    }

    @Override
    public boolean addGood(Good good) {


        return goodMapper.addGood(good);
    }
}
