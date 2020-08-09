package com.okgo.goodhelper.service;

import com.okgo.goodhelper.pojo.Good;

import java.util.List;

public interface GoodService {

    int selectXinazhiAmountByUserId(Integer user_id);

    boolean updateGoodStatus(Integer good_id,String status);

    List<Good> selectGoodList(Integer user_id);

    boolean addGood(Good good);
}