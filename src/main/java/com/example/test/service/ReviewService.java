package com.example.test.service;


import com.example.test.domain.Review;

import java.util.List;

/**
* @author Forzh
* @description 针对表【review】的数据库操作Service
* @createDate 2022-03-11 15:59:17
*/
public interface ReviewService {

    List<Review> selectAllReview(Review review, Integer pageNum, Integer pageSize);

    int insertSelective(Review record);

    Review selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Review record);

}
