package com.example.test.mapper;

import com.example.test.domain.Managers;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Forzh
* @description 针对表【managers】的数据库操作Mapper
* @createDate 2022-03-04 19:06:35
* @Entity com.example.test.domain.Managers
*/
public interface ManagersMapper {

    List<Managers> selectAllManager(@Param("manager") Managers record,
                                                                 @Param("pageNum") Integer pageNum,
                                                                 @Param("pageSize") Integer pageSize);

    Managers selectManager(Managers record);

    int deleteByPrimaryKey(Integer id);

    int insert(Managers record);

    int insertSelective(Managers record);

    Managers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Managers record);

    int updateByPrimaryKey(Managers record);

}
