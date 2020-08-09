package com.okgo.goodhelper.controller;


import com.okgo.goodhelper.mapper.GoodMapper;
import com.okgo.goodhelper.pojo.Good;
import com.okgo.goodhelper.pojo.User;
import com.okgo.goodhelper.pojo.nopojo.Count;
import com.okgo.goodhelper.service.Impl.GleaningServiceImpl;
import com.okgo.goodhelper.service.Impl.GoodServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodController {

    @Autowired
    private GoodMapper goodMapper;

    @Autowired
    private GoodServiceImpl goodService;

    @Autowired
    private GleaningServiceImpl gleaningService;


    @GetMapping("/queryGoodList")
    public List<Good> queryGoodList(){

        List<Good> goodList = goodMapper.queryGoodList();
        return goodList;
    }

    @GetMapping("/count")
    public Count selectXinazhiAmountByUserId(Integer user_id){

        System.out.println("进入selectXinazhiAmountByUserId");

      //  List<Count> list=new ArrayList<Count>();
        //首先查询当前user_id的闲置数量


        int good_num = goodService.selectXinazhiAmountByUserId(user_id);

        //其次 查询当前user_id的报失数量，此时type="0"
        String type = "0";

        int gln0_num = gleaningService.selectAmountByUserId(user_id,type);

        //最后，查询当前user_id的拾遗数量，此时type="1"
        type = "1";
        int gln1_num = gleaningService.selectAmountByUserId(user_id,type);

        //将上面三个做成一个列表，传到前端

        Count count =  new Count(good_num,gln0_num,gln1_num);
        System.out.println(count);
      //  list.add(count);
        return count;
    }


    @PutMapping("/goodstatu")
    private boolean updateGoodStatus(@RequestBody Good good){
        System.out.println("前端传过来的gln_id:"+good.getGood_id());
        System.out.println("前端穿过来的status:"+good.getStatus());

        return goodMapper.updateGoodStatus(good.getGood_id(),good.getStatus());
    }

    @GetMapping("/goodlist")
    private List<Good> selectGoodList(Integer user_id){


        List<Good> goodList = goodService.selectGoodList(user_id);

        System.out.println(goodList);
        return goodList;
    }


    @PostMapping("/goodWj")
    public boolean addGood(@RequestBody Good good){
        System.out.println(good);

        good.setIs_free(0);

        return goodService.addGood(good);
    }


}
