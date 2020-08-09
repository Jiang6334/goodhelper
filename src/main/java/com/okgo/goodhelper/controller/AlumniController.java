package com.okgo.goodhelper.controller;

import com.okgo.goodhelper.pojo.Alumni;
import com.okgo.goodhelper.pojo.User;
import com.okgo.goodhelper.service.Impl.AlumniServiceImpl;
import com.okgo.goodhelper.service.Impl.UserServiceImpl;
import com.okgo.goodhelper.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class AlumniController {


    @Autowired
    private AlumniServiceImpl alumniService;
    @Autowired
    private UserServiceImpl userService;


    //校友认证测试接口
    public boolean insertAlumni(@RequestBody Alumni alumni){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        alumni.setCreate_time(df.format(new Date()));
        int count = alumniService.insertAlumni(alumni); // count表示插入的行数，打印的插入0行
        System.out.println(count); // TODO 换用log
        if (count>=1)
            return true;
        else
            return false;
    }

    //按照前端小程序做的接口，用来接收校友认证的数据
    @PostMapping("/addAlumni")
    public boolean addAlumni(@RequestBody Alumni alumni){
        System.out.println("测试返回数据是否正常"+alumni);
        //向alumni中插入数据
        //User user= userService.queryUserByUserId(alumni_id);
        int count1 = alumniService.addAlumni(alumni);
        //校友认证修改user中的is_alumni中认证为1
        userService.updateUserIsAlumni(alumni.getUser_id());
        if (count1 >= 1)
            return true;
        else
            return false;

    }

    //校友认证根据user_id返回数据，alumni_id和user_id等价
    @GetMapping("/alumni")
    public List<Alumni> getAlumni(Integer user_id){


        System.out.println("user_id:"+user_id);

        System.out.println(alumniService.getAlumniByAlumniId(user_id));
        return alumniService.getAlumniByAlumniId(user_id);
    }


}
