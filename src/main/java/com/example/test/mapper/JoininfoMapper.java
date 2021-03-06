package com.example.test.mapper;

import com.example.test.domain.Joininfo;
import com.example.test.domain.StatisticalResults;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Forzh
 * @description 针对表【joininfo】的数据库操作Mapper
 * @createDate 2022-03-11 18:07:00
 * @Entity com.example.test.domain.Joininfo
 */
public interface JoininfoMapper {

    List<StatisticalResults> selectYear();

    List<StatisticalResults> selectMonth(StatisticalResults statisticalResults);

    List<StatisticalResults> selectMoneysByYDate(StatisticalResults statisticalResults);

    List<StatisticalResults> selectMoneysByDate(StatisticalResults statisticalResults);

    Integer selectCount();

    Integer selectCountToday();

    List<Joininfo> selectAllJoinInfo(@Param("joininfo") Joininfo record,
                                     @Param("pageNum") Integer pageNum,
                                     @Param("pageSize") Integer pageSize);

    int deleteByPrimaryKey(Integer id);

    int insert(Joininfo record);

    int insertSelective(Joininfo record);

    Joininfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Joininfo record);

    int updateByPrimaryKey(Joininfo record);

}
