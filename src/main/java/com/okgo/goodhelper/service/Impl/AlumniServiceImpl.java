package com.okgo.goodhelper.service.Impl;

import com.okgo.goodhelper.mapper.AlumniMapper;
import com.okgo.goodhelper.pojo.Alumni;
import com.okgo.goodhelper.service.AlumniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumniServiceImpl implements AlumniService {

    @Autowired
    AlumniMapper alumniMapper;
    @Override
    public int insertAlumni(Alumni alumni) {

        return alumniMapper.insertAlumni(alumni);
    }

    @Override
    public int addAlumni(Integer userId, String faculty, String major, String number, String almName) {
        return alumniMapper.addAlumni(userId,faculty,major,number,almName);
    }



    @Override
    public List<Alumni> selectAlumniAll() {
        return null;
    }


}
