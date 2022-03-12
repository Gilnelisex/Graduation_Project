package com.example.test.service;


import com.example.test.domain.Rotation;

import java.util.List;

/**
* @author Forzh
* @description 针对表【rotation】的数据库操作Service
* @createDate 2022-03-12 19:49:23
*/
public interface RotationService {

    List<Rotation> selectAllRotation(Rotation rotation, Integer pageNum, Integer pageSize);

    List<Rotation> selectLocation();

    int insertSelective(Rotation record);

    Rotation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rotation record);

}
