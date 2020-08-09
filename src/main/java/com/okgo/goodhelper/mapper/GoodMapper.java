package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.Good;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodMapper {
    List<Good> queryGoodList();

    int selectXinazhiAmountByUserId(Integer user_id);

    boolean updateGoodStatus(Integer good_id,String status);

    List<Good> selectGoodList(Integer user_id);

    boolean addGood(Good good);


}
