package com.example.test.service.impl;

import com.example.test.domain.Rotation;
import com.example.test.mapper.RotationMapper;
import com.example.test.service.RotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Forzh
* @description 针对表【rotation】的数据库操作Service实现
* @createDate 2022-03-12 19:49:23
*/
@Service
public class RotationServiceImpl implements RotationService{

    @Autowired
    RotationMapper rotationMapper;

    @Override
    public List<Rotation> selectAllRotation(Rotation rotation, Integer pageNum, Integer pageSize) {
        return this.rotationMapper.selectAllRotation(rotation, pageNum, pageSize);
    }

    @Override
    public List<Rotation> selectLocation() {
        return this.rotationMapper.selectLocation();
    }

    @Override
    public int insertSelective(Rotation record) {
        return this.rotationMapper.insertSelective(record);
    }

    @Override
    public Rotation selectByPrimaryKey(Integer id) {
        return this.rotationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Rotation record) {
        return this.rotationMapper.updateByPrimaryKeySelective(record);
    }
}
