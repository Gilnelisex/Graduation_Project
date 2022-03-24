package com.example.test.service;


import com.example.test.domain.Joininfo;
import com.example.test.domain.StatisticalResults;

import java.util.List;

/**
* @author Forzh
* @description 针对表【joininfo】的数据库操作Service
* @createDate 2022-03-11 18:06:54
*/
public interface JoininfoService {

    List<StatisticalResults> selectYear();

    List<StatisticalResults> selectMonth(StatisticalResults statisticalResults);

    List<StatisticalResults> selectMoneysByYDate (StatisticalResults statisticalResults);

    List<StatisticalResults> selectMoneysByDate (StatisticalResults joininfo);

    Integer selectCount();

    Integer selectCountToday();

    List<Joininfo> selectAllJoinInfo(Joininfo record, Integer pageNum, Integer pageSize);

    int insertSelective(Joininfo record);

    Joininfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joininfo record);

}
