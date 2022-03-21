package com.example.test.service.impl;

import com.example.test.domain.Review;
import com.example.test.mapper.ReviewMapper;
import com.example.test.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Forzh
* @description 针对表【review】的数据库操作Service实现
* @createDate 2022-03-11 15:59:17
*/
@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewMapper reviewMapper;

    @Override
    public Integer selectCount() {
        return this.reviewMapper.selectCount();
    }

    @Override
    public Integer selectCountToday() {
        return this.reviewMapper.selectCountToday();
    }

    @Override
    public List<Review> selectAllReview(Review review, Integer pageNum, Integer pageSize) {
        return this.reviewMapper.selectAllReview(review, pageNum, pageSize);
    }

    @Override
    public int insertSelective(Review record) {
        return this.reviewMapper.insertSelective(record);
    }

    @Override
    public Review selectByPrimaryKey(Integer id) {
        return this.reviewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Review record) {
        return this.reviewMapper.updateByPrimaryKeySelective(record);
    }

}
