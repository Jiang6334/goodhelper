package com.okgo.goodhelper.controller;


import com.okgo.goodhelper.pojo.Category;
import com.okgo.goodhelper.service.CategoryService;
import com.okgo.goodhelper.service.Impl.CategorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategorServiceImpl categorService;



    @GetMapping("/categoryWj")
    public List<Category> selectCategoryAll(){
        return categorService.selectCategoryAll();
    }



}
