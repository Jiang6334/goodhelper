package com.okgo.goodhelper.controller;

import com.okgo.goodhelper.pojo.Category;
import com.okgo.goodhelper.pojo.Gleaning;
import com.okgo.goodhelper.pojo.Good;
import com.okgo.goodhelper.service.Impl.GleaningServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GleaningController {


    @Autowired
    private GleaningServiceImpl gleaningService;


    @PutMapping("/glnstatu") //未测试
    public boolean updateGlnStatus(@RequestBody Gleaning gleaning){

        System.out.println("前端传过来的gln_id:"+gleaning.getGln_id());
        System.out.println("前端穿过来的status:"+gleaning.getStatus());

        return gleaningService.updateGlnStatus(gleaning.getGln_id(),gleaning.getStatus());
    }

    @GetMapping("/glnlist") //测试成功
    public List<Gleaning> selectGlnList(Gleaning gleaning){

        List<Gleaning> gleaningList = gleaningService.selectGlnList(gleaning.getUser_id());//,"0"

        System.out.println(gleaningList);

        return gleaningList;
    }

    @PostMapping("/gleaningWj")
    public boolean addGleaning(@RequestBody Gleaning gleaning){

        System.out.println(gleaning);
        return gleaningService.addGleaning(gleaning);
    }

    @GetMapping("/gleaning")
    public List<Gleaning> getGleaningByTabId(Integer type){
        List<Gleaning> list = gleaningService.selectByTabId(type);
        System.out.println(list.toString());
        return list;
    }

    @GetMapping("/category")
    public List<Category> getCategoryList(){
        List<Category> list =  gleaningService.selectCategoryList();
        System.out.println(list.toString());
        return list;

    }

    @GetMapping("/good")
    public List<Good> getGoodsList(){
        System.out.println("212121212");
        List<Good> goods = gleaningService.selectGoodsList();
        System.out.println(goods.toString());
        return goods;
    }

    /**
     * 闲置处分类信息物品展示
     * @param cate_name
     * @return
     */
    @GetMapping("/good1")
    public List<Good> selectGoodsByCateNameLsit(String cate_name){
        System.out.println(cate_name);
        List<Good> list = gleaningService.selectGoodsByCateNameLsit(cate_name);
        System.out.println(list.toString());
        return list;
    }

}
