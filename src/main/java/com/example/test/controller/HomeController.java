package com.example.test.controller;

import com.example.test.service.ActivityService;
import com.example.test.service.BaseService;
import com.example.test.service.JoininfoService;
import com.example.test.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ActivityService activityService;
    @Autowired
    BaseService baseService;
    @Autowired
    ReviewService reviewService;
    @Autowired
    JoininfoService joininfoService;

    @GetMapping("/management")
    public String management(Model model) {
        Integer activityCount = this.activityService.selectCount();
        Integer activityCountToday = this.activityService.selectCountToday();
        Integer baseCount = this.baseService.selectCount();
        Integer baseCountToday = this.baseService.selectCountToday();
        Integer reviewCount = this.reviewService.selectCount();
        Integer reviewCountToday = this.reviewService.selectCountToday();
        Integer joinInfoCount = this.joininfoService.selectCount();
        Integer joinInfoCountToday = this.joininfoService.selectCountToday();
        model.addAttribute("activityCount", activityCount);
        model.addAttribute("activityCountToday", activityCountToday);
        model.addAttribute("baseCount", baseCount);
        model.addAttribute("baseCountToday", baseCountToday);
        model.addAttribute("reviewCount", reviewCount);
        model.addAttribute("reviewCountToday", reviewCountToday);
        model.addAttribute("joinInfoCount", joinInfoCount);
        model.addAttribute("joinInfoCountToday", joinInfoCountToday);
        return "management/homePage";
    }

}
