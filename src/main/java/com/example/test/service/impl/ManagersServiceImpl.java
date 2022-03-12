package com.example.test.service.impl;

import com.example.test.domain.Managers;
import com.example.test.mapper.ManagersMapper;
import com.example.test.service.ManagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【managers】的数据库操作Service实现
 * @createDate 2022-03-04 19:06:30
 */
@Service
public class ManagersServiceImpl implements ManagersService {

    @Autowired
    ManagersMapper managersMapper;


    @Override
    public List<Managers> selectAllManager(Managers record, Integer pageNum, Integer pageSize) {
        return this.managersMapper.selectAllManager(record, pageNum, pageSize);
    }

    @Override
    public Managers selectManager(Managers record) {
        return this.managersMapper.selectManager(record);
    }

    @Override
    public Managers selectByPrimaryKey(Integer id) {
        return this.managersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Managers record) {
        return this.managersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int insertSelective(Managers record) {
        return this.managersMapper.insertSelective(record);
    }
}




