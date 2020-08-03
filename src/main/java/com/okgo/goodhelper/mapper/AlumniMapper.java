package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.Alumni;
import com.okgo.goodhelper.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumniMapper{
    int insertAlumni(Alumni alumni);
    int addAlumni(Integer userId, String faculty,String major,String number,String almName);
}