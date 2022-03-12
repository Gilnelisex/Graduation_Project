package com.example.test.controller;

import com.example.test.domain.Activity;
import com.example.test.domain.Review;
import com.example.test.service.ActivityService;
import com.example.test.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @Autowired
    ActivityService activityService;

    @GetMapping("/reviewManage")
    public String reviewManage(Review review, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveReview", review);
        } else {
            review = (Review) session.getAttribute("selectiveReview");
        }
        //查询
        List<Activity> activityList = this.activityService.selectAllActivityName();
        List<Review> reviewList = this.reviewService.selectAllReview(review, pageNum, 5);
        //保存数据请请求作用域
        model.addAttribute("activityList", activityList);
        model.addAttribute("reviewList", reviewList);
        return "management/reviewManage/reviewManage";
    }
    @GetMapping("/getInsertReview")
    public String getInsertReview(Model model) {
        List<Activity> activityList = this.activityService.selectAllActivityName();
        model.addAttribute("activityList", activityList);
        return "management/reviewManage/insertReview";
    }

    @PutMapping("/insertReview")
    public String insertReview(Review review) {
        if(this.reviewService.insertSelective(review) == 1) {
            return "redirect:/reviewManage";
        }else {
            return "redirect:/reviewManage";
        }
    }

    @GetMapping("/getUpdateReview/{id}")
    public String getUpdateReview(@PathVariable("id") Integer id, Model model) {
        Review review = this.reviewService.selectByPrimaryKey(id);
        List<Activity> activityList = this.activityService.selectAllActivityName();
        model.addAttribute("review", review);
        model.addAttribute("activityList", activityList);
        return "management/reviewManage/updateReview";
    }

    @PutMapping("/updateReview")
    public String updateReview(Review review) {
        if(this.reviewService.updateByPrimaryKeySelective(review) == 1) {
            return "redirect:/reviewManage";
        }else {
            return "redirect:/reviewManage";
        }
    }

    @GetMapping("/getSjReview/{id}")
    public String getSjReview(@PathVariable("id") Integer id, Model model) {
        Review review = this.reviewService.selectByPrimaryKey(id);
        model.addAttribute("review", review);
        return "management/reviewManage/sjReview";
    }

    @PutMapping("/sjReview")
    public String sjReview(Review review) {
        if(this.reviewService.updateByPrimaryKeySelective(review) == 1) {
            return "redirect:/reviewManage";
        }else {
            return "redirect:/reviewManage";
        }
    }

    @GetMapping("/getXjReview/{id}")
    public String getXjReview(@PathVariable("id") Integer id, Model model) {
        Review review = this.reviewService.selectByPrimaryKey(id);
        model.addAttribute("review", review);
        return "management/reviewManage/xjReview";
    }

    @PutMapping("/xjReview")
    public String xjReview(Review review) {
        if(this.reviewService.updateByPrimaryKeySelective(review) == 1) {
            return "redirect:/reviewManage";
        }else {
            return "redirect:/reviewManage";
        }
    }

    @GetMapping("/getDeleteReview/{id}")
    public String getDeleteReview(@PathVariable("id") Integer id, Model model) {
       Review review = this.reviewService.selectByPrimaryKey(id);
        model.addAttribute("review", review);
        return "management/reviewManage/deleteReview";
    }

    @PutMapping("/deleteReview")
    public String deleteReview(Review review) {
        if(this.reviewService.updateByPrimaryKeySelective(review) == 1) {
            return "redirect:/reviewManage";
        }else {
            return "redirect:/reviewManage";
        }
    }
}
