package com.example.test.service.impl;

import com.example.test.domain.ActBaseCount;
import com.example.test.domain.Activity;
import com.example.test.mapper.ActivityMapper;
import com.example.test.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【activity】的数据库操作Service实现
 * @createDate 2022-03-03 16:39:20
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    ActivityMapper activityMapper;

    @Override
    public List<ActBaseCount> selectCountByBase() {
        return this.activityMapper.selectCountByBase();
    }

    @Override
    public Integer selectCount() {
        return this.activityMapper.selectCount();
    }

    @Override
    public Integer selectCountToday() {
        return this.activityMapper.selectCountToday();
    }

    @Override
    public List<Activity> selectAllActivity(Activity record, Integer pageNum, Integer pageSize) {
        return this.activityMapper.selectAllActivity(record, pageNum, pageSize);
    }

    @Override
    public List<Activity> selectAllType() {
        return this.activityMapper.selectAllType();
    }

    @Override
    public List<Activity> selectAllHarvest() {
        return this.activityMapper.selectAllHarvest();
    }

    @Override
    public List<Activity> selectAllActivityName() {
        return this.activityMapper.selectAllActivityName();
    }

    @Override
    public int insertSelective(Activity record) {
        return this.activityMapper.insertSelective(record);
    }

    @Override
    public Activity selectByPrimaryKey(Integer id) {
        return this.activityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Activity record) {
        return this.activityMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByField(Integer id) {
        return this.activityMapper.updateByField(id);
    }
}
