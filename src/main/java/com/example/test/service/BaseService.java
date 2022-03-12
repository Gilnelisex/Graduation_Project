package com.example.test.service;

import com.example.test.domain.Base;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【base】的数据库操作Service
 * @createDate 2022-03-03 16:39:20
 */
public interface BaseService {

    List<Base> selectAllBaseName();

    List<Base> selectAllType();

    List<Base> selectAllBase(Base record, Integer pageNum, Integer pageSize);

    int insertSelective(Base record);

    Base selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Base record);
}
