package com.okgo.goodhelper.mapper;

import com.okgo.goodhelper.pojo.Alumni;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumniMapper{
    int insertAlumni(Alumni alumni);
    int addAlumni(Alumni alumni);

    //int addAlumni(@Param("alm_name") String alm_name, @Param("alumni_id") int alumni_id, @Param("create_time") String create_time, @Param("faculty") String faculty, @Param("major") String major, @Param("number") String number);

    List<Alumni>  getAlumniByAlumniId( Integer user_id);

}