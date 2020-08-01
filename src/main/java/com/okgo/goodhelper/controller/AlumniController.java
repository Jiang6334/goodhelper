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

    @PostMapping("/insertAlumni")
    public String insertAlumni(@RequestBody Alumni alumni){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        alumni.setCreateTime(df.format(new Date()));
        int count = alumniService.insertAlumni(alumni); // count表示插入的行数，打印的插入0行
        System.out.println(count); // TODO 换用log
        if (count>1)
            return "1";
        else
            return "0";
    }
    //就是这两个插入执行不报错，但是插入进去

    @PostMapping("insertAlumniID")
    public String insertAlumniID(Integer userId,Integer alumniId){


        int count = alumniService.insertAlumniID(userId,alumniId);
        log.info(userId+"");
        if (count>1)
            return "1";
        else
            return "0";
    }

}
