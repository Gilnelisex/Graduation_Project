package com.example.test.service;

import com.example.test.domain.Users;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【users】的数据库操作Service
 * @createDate 2022-03-04 19:04:12
 */
public interface UsersService {
    List<Users> selectAllUser(Users record, Integer pageNum, Integer pageSize);

    Users selectByPrimaryKey(Integer id);

    int insertSelective(Users record);

    int updateByPrimaryKeySelective(Users record);
}
