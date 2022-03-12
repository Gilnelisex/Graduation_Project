package com.example.test.mapper;

import com.example.test.domain.Base;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Forzh
* @description 针对表【base】的数据库操作Mapper
* @createDate 2022-03-03 16:39:44
* @Entity com.example.test.domain.Base
*/
public interface BaseMapper {

    List<Base> selectAllBaseName();

    List<Base> selectAllType();

    List<Base> selectAllBase(@Param("base") Base record,
                             @Param("pageNum") Integer pageNum,
                             @Param("pageSize") Integer pageSize);

    int deleteByPrimaryKey(Integer id);

    int insert(Base record);

    int insertSelective(Base record);

    Base selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Base record);

    int updateByPrimaryKey(Base record);

}
