package com.example.test.service.impl;

import com.example.test.domain.Joininfo;
import com.example.test.mapper.JoininfoMapper;
import com.example.test.service.JoininfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Forzh
* @description 针对表【joininfo】的数据库操作Service实现
* @createDate 2022-03-11 18:06:54
*/
@Service
public class JoininfoServiceImpl implements JoininfoService{

    @Autowired
    JoininfoMapper joininfoMapper;

    @Override
    public List<Joininfo> selectAllJoinInfo(Joininfo record, Integer pageNum, Integer pageSize) {
        return this.joininfoMapper.selectAllJoinInfo(record, pageNum, pageSize);
    }

    @Override
    public int insertSelective(Joininfo record) {
        return this.joininfoMapper.insertSelective(record);
    }

    @Override
    public Joininfo selectByPrimaryKey(Integer id) {
        return this.joininfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Joininfo record) {
        return this.joininfoMapper.updateByPrimaryKeySelective(record);
    }
}
