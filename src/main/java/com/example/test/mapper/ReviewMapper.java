package com.example.test.mapper;

import com.example.test.domain.Activity;
import com.example.test.domain.Review;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Forzh
* @description 针对表【review】的数据库操作Mapper
* @createDate 2022-03-11 15:59:37
* @Entity com.example.test.domain.Review
*/
public interface ReviewMapper {

    List<Review> selectAllReview(@Param("review") Review review,
                                                @Param("pageNum") Integer pageNum,
                                                @Param("pageSize") Integer pageSize);

    int deleteByPrimaryKey(Integer id);

    int insert(Review record);

    int insertSelective(Review record);

    Review selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Review record);

    int updateByPrimaryKey(Review record);

}
