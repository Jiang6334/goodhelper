package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.Category;
import com.okgo.goodhelper.pojo.Gleaning;
import com.okgo.goodhelper.pojo.Good;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GleaningMapper {


    int selectAmountByUserId(Integer user_id,String type);

    int updateGlnStatus(Integer gln_id,String status);

    List<Gleaning> selectGlnList(Integer user_id);//,String type

    boolean addGleaning(Gleaning gleaning);

    List<Gleaning> selectByTabId(@Param("tab_id") Integer tab_id);

    List<Category> selectCategoryList();

    List<Good> selectGoodsList();

    List<Good> selectGoodsByCateNameLsit(String cate_name);

    int changeGlnImage(@Param("image")String image,@Param("productId")int productId);

    int insertGlnImage(String image,int productId);

}
