package com.okgo.goodhelper.controller;

import com.okgo.goodhelper.pojo.Alumni;
import com.okgo.goodhelper.service.Impl.AlumniServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Slf4j
public class AlumniController {


    @Autowired
    private AlumniServiceImpl alumniService;

    //校友认证测试接口
    @PostMapping("/insertAlumni")
    public boolean insertAlumni(@RequestBody Alumni alumni){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        alumni.setCreateTime(df.format(new Date()));
        int count = alumniService.insertAlumni(alumni); // count表示插入的行数，打印的插入0行
        System.out.println(count); // TODO 换用log
        if (count>=1)
            return true;
        else
            return false;
    }

    //按照前端小程序做的接口，用来接收校友认证的数据
    @PostMapping("addAlumni")
    public boolean addAlumni(Integer userId, String faculty, String major, String number, String almName){
        int count1 = alumniService.addAlumni(userId,faculty,major,number,almName);
        if (count1 >= 1)
            return true;
        else
            return false;
    }
}
