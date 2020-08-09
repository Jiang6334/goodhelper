package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryMapper {

    List<Category> selectCategoryAll();
}
