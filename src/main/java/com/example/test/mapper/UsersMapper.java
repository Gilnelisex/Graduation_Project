package com.example.test.mapper;

import com.example.test.domain.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Forzh
* @description 针对表【users】的数据库操作Mapper
* @createDate 2022-03-04 19:07:09
* @Entity com.example.test.domain.Users
*/
public interface UsersMapper {

    List<Users> selectAllUser(@Param("user") Users record,
                                                   @Param("pageNum") Integer pageNum,
                                                   @Param("pageSize") Integer pageSize);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

}
