package com.okgo.goodhelper.service.Impl;

import com.okgo.goodhelper.mapper.GleaningMapper;
import com.okgo.goodhelper.pojo.Category;
import com.okgo.goodhelper.pojo.Gleaning;
import com.okgo.goodhelper.pojo.Good;
import com.okgo.goodhelper.service.GleaningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GleaningServiceImpl implements GleaningService {

    @Autowired
    private GleaningMapper gleaningMapper;

    @Override
    public int selectAmountByUserId(Integer user_id, String type) {
        return gleaningMapper.selectAmountByUserId(user_id,type);
    }

    @Override
    public boolean updateGlnStatus(Integer gln_id, String status) {
        gleaningMapper.updateGlnStatus(gln_id,status);

        return true;
    }

    @Override
    public List<Gleaning> selectGlnList(Integer user_id) { //,String type


        return gleaningMapper.selectGlnList(user_id); //,type
    }

    @Override
    public boolean addGleaning(Gleaning gleaning) {

        return gleaningMapper.addGleaning(gleaning);
    }

    @Override
    public List<Gleaning> selectByTabId(int tab_id) {
        return gleaningMapper.selectByTabId(tab_id);
    }

    @Override
    public List<Category> selectCategoryList() {
        return gleaningMapper.selectCategoryList();
    }

    @Override
    public List<Good> selectGoodsList() {
        return gleaningMapper.selectGoodsList();
    }

    @Override
    public List<Good> selectGoodsByCateNameLsit(String cate_name) {
        return gleaningMapper.selectGoodsByCateNameLsit(cate_name);
    }
}
