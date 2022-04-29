package com.example.test.service;

import com.example.test.domain.ActBaseCount;
import com.example.test.domain.Activity;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【activity】的数据库操作Service
 * @createDate 2022-03-03 16:39:20
 */
public interface ActivityService {

    List<ActBaseCount> selectCountByBase();

    Integer selectCount();

    Integer selectCountToday();

    List<Activity> selectAllActivity(Activity record, Integer pageNum, Integer pageSize);

    List<Activity> selectAllType();

    List<Activity> selectAllHarvest();

    List<Activity> selectAllActivityName();

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByField(Integer id);

}
