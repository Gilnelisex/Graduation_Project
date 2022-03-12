package com.example.test.service;

import com.example.test.domain.Managers;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【managers】的数据库操作Service
 * @createDate 2022-03-04 19:06:30
 */
public interface ManagersService {

    List<Managers> selectAllManager(Managers record, Integer pageNum, Integer pageSize);

    Managers selectManager(Managers record);

    Managers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Managers record);

    int insertSelective(Managers record);

}
