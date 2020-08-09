package com.okgo.goodhelper.service.Impl;

import com.okgo.goodhelper.mapper.CategoryMapper;
import com.okgo.goodhelper.pojo.Category;
import com.okgo.goodhelper.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.CachedRowSet;
import java.util.List;

@Service
public class CategorServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<Category> selectCategoryAll() {
        return categoryMapper.selectCategoryAll();
    }
}
