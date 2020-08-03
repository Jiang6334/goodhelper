package com.okgo.goodhelper.service;

import com.okgo.goodhelper.pojo.Alumni;
import com.okgo.goodhelper.pojo.User;

import java.util.List;

public interface AlumniService {
    int insertAlumni(Alumni alumni);
    int addAlumni(Integer userId, String faculty,String major,String number,String almName);
    List<Alumni> selectAlumniAll();
}
