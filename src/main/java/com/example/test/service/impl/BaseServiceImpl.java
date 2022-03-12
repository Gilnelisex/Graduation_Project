package com.example.test.service.impl;

import com.example.test.domain.Base;
import com.example.test.mapper.BaseMapper;
import com.example.test.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【base】的数据库操作Service实现
 * @createDate 2022-03-03 16:39:20
 */
@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    BaseMapper baseMapper;

    @Override
    public List<Base> selectAllBaseName() {
        return this.baseMapper.selectAllBaseName();
    }

    @Override
    public List<Base> selectAllType() {
        return this.baseMapper.selectAllType();
    }

    @Override
    public List<Base> selectAllBase(Base record, Integer pageNum, Integer pageSize) {
        return this.baseMapper.selectAllBase(record, pageNum, pageSize);
    }

    @Override
    public int insertSelective(Base record) {
        return this.baseMapper.insertSelective(record);
    }

    @Override
    public Base selectByPrimaryKey(Integer id) {
        return this.baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Base record) {
        return this.baseMapper.updateByPrimaryKeySelective(record);
    }
}
