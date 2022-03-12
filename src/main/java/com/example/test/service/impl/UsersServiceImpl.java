package com.example.test.service.impl;

import com.example.test.domain.Users;
import com.example.test.mapper.UsersMapper;
import com.example.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【users】的数据库操作Service实现
 * @createDate 2022-03-04 19:04:12
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<Users> selectAllUser(Users record, Integer pageNum, Integer pageSize) {
        return this.usersMapper.selectAllUser(record, pageNum, pageSize);
    }

    @Override
    public Users selectByPrimaryKey(Integer id) {
        return this.usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Users record) {
        return this.usersMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return this.usersMapper.updateByPrimaryKeySelective(record);
    }
}
