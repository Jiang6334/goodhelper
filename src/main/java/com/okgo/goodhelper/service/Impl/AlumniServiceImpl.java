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
    public int insertAlumniID(Integer userId, Integer alumniId) {
        return 0;
    }

    @Override
    public List<Alumni> selectAlumniAll() {
        return null;
    }


}
