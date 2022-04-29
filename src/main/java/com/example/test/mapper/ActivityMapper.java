package com.example.test.mapper;

import com.example.test.domain.ActBaseCount;
import com.example.test.domain.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Forzh
* @description 针对表【activity】的数据库操作Mapper
* @createDate 2022-03-03 16:39:44
* @Entity com.example.test.domain.Activity
*/
public interface ActivityMapper {

    List<ActBaseCount> selectCountByBase();

    Integer selectCount();

    Integer selectCountToday();

    List<Activity> selectAllActivity(@Param("activity") Activity record,
                                     @Param("pageNum") Integer pageNum,
                                     @Param("pageSize") Integer pageSize);

    List<Activity> selectAllType();

    List<Activity> selectAllHarvest();

    List<Activity> selectAllActivityName();

    int deleteByPrimaryKey(Integer id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    int updateByField(Integer id);

}
