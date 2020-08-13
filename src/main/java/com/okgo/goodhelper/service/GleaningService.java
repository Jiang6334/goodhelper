package com.okgo.goodhelper.service;

import com.okgo.goodhelper.pojo.Category;
import com.okgo.goodhelper.pojo.Gleaning;
import com.okgo.goodhelper.pojo.Good;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.List;

public interface GleaningService {


    int selectAmountByUserId(Integer user_id, String type);

    boolean updateGlnStatus(Integer gln_id,String status);

    List<Gleaning> selectGlnList(Integer user_id);//,String type

    boolean addGleaning(Gleaning gleaning);


    List<Gleaning> selectByTabId(int tab_id);

    List<Category> selectCategoryList();

    List<Good> selectGoodsList();

    List<Good> selectGoodsByCateNameLsit(String cate_name);

    int addGlnImage(String image,Integer good_id);

    int changeGlnImage(String image, Integer good_id);
}
