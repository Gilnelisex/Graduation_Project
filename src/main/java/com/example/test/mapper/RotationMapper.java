package com.example.test.mapper;

import com.example.test.domain.Rotation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【rotation】的数据库操作Mapper
 * @createDate 2022-03-12 19:49:29
 * @Entity com.example.test.domain.Rotation
 */
public interface RotationMapper {

    List<Rotation> selectAllRotation(@Param("rotation") Rotation rotation,
                                     @Param("pageNum") Integer pageNum,
                                     @Param("pageSize") Integer pageSize);

    List<Rotation> selectLocation();

    int deleteByPrimaryKey(Integer id);

    int insert(Rotation record);

    int insertSelective(Rotation record);

    Rotation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rotation record);

    int updateByPrimaryKey(Rotation record);

}
