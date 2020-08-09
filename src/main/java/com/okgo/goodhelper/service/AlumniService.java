package com.okgo.goodhelper.service;

import com.okgo.goodhelper.pojo.Alumni;
import com.okgo.goodhelper.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlumniService {

    int insertAlumni(Alumni alumni);
    //校友认证插入alumni表
    int addAlumni(Alumni alumni);
    List<Alumni> selectAlumniAll();

    //校友认证通过user_id得到数据alumni
    List<Alumni> getAlumniByAlumniId(Integer user_id);

}
