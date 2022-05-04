package com.example.test.controller;

import com.example.test.domain.ActBaseCount;
import com.example.test.domain.Base;
import com.example.test.domain.StatisticalResults;
import com.example.test.service.ActivityService;
import com.example.test.service.BaseService;
import com.example.test.service.JoininfoService;
import com.example.test.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/selectActCount")
    @ResponseBody
    public List<ActBaseCount> selectActCount() {
        List<ActBaseCount> activityBaseCount = this.activityService.selectCountByBase();
        List<Base> baseList = this.baseService.selectAllBaseName();
        List<ActBaseCount> z = new ArrayList<ActBaseCount>();
        for (int i = 0; i < baseList.size(); i++) {
            String baseName = baseList.get(i).getName();
            for (int j = 0; j < activityBaseCount.size(); j++) {
                String baseNames = activityBaseCount.get(j).getBasename();
                if (baseName.equals(baseNames)) {
                    ActBaseCount s1 = new ActBaseCount();
                    s1.setBasename(baseNames);
                    s1.setActcount(activityBaseCount.get(j).getActcount());
                    z.add(i, s1);
                    break;
                } else if (j == activityBaseCount.size() - 1) {
                    ActBaseCount s2 = new ActBaseCount();
                    s2.setBasename(baseName);
                    s2.setActcount(0);
                    z.add(i, s2);
                }
            }
        }
        return z;
    }

    @GetMapping("/selectYear")
    @ResponseBody
    public List<StatisticalResults> selectYear() {
        List<StatisticalResults> statisticalResultsList = this.joininfoService.selectYear();
        return statisticalResultsList;
    }

    @GetMapping("/selectMonth")
    @ResponseBody
    public List<StatisticalResults> selectMonth(StatisticalResults statisticalResults) {
        List<StatisticalResults> statisticalResultsList = this.joininfoService.selectMonth(statisticalResults);
        return statisticalResultsList;
    }

    @GetMapping("/selectMoneysByYear")
    @ResponseBody
    public List<StatisticalResults> selectMoneysByYear(StatisticalResults statisticalResults) {
        List<StatisticalResults> statisticalResultsList = this.joininfoService.selectMoneysByYDate(statisticalResults);
        List<Base> baseList = this.baseService.selectAllBaseName();
        List<StatisticalResults> z = new ArrayList<StatisticalResults>();
        for (int i = 0; i < baseList.size(); i++) {
            String baseName = baseList.get(i).getName();
            for (int j = 0; j < statisticalResultsList.size(); j++) {
                String baseNames = statisticalResultsList.get(j).getBasename();
                if (baseName.equals(baseNames)) {
                    StatisticalResults s1 = new StatisticalResults();
                    s1.setBasename(baseNames);
                    s1.setPricecount(statisticalResultsList.get(j).getPricecount());
                    z.add(i, s1);
                    break;
                } else if (j == statisticalResultsList.size() - 1) {
                    StatisticalResults s2 = new StatisticalResults();
                    s2.setBasename(baseName);
                    s2.setPricecount(0);
                    z.add(i, s2);
                }
            }
        }
        return z;
    }

    @GetMapping("/selectMoneysByMonth")
    @ResponseBody
    public List<StatisticalResults> selectMoneysByMonth(StatisticalResults statisticalResults) {
        List<StatisticalResults> statisticalResultsList = this.joininfoService.selectMoneysByDate(statisticalResults);
        List<Base> baseList = this.baseService.selectAllBaseName();
        List<StatisticalResults> z = new ArrayList<StatisticalResults>();
        if (statisticalResultsList.size() == 0) {
            for (int i = 0; i < baseList.size(); i++) {
                StatisticalResults s = new StatisticalResults();
                s.setBasename(baseList.get(i).getName());
                s.setPricecount(0);
                z.add(i, s);
            }
        } else {
            for (int i = 0; i < baseList.size(); i++) {
                String baseName = baseList.get(i).getName();
                for (int j = 0; j < statisticalResultsList.size(); j++) {
                    String baseNames = statisticalResultsList.get(j).getBasename();
                    if (baseName.equals(baseNames)) {
                        StatisticalResults s1 = new StatisticalResults();
                        s1.setBasename(baseNames);
                        s1.setPricecount(statisticalResultsList.get(j).getPricecount());
                        z.add(i, s1);
                        break;
                    } else if (j == statisticalResultsList.size() - 1) {
                        StatisticalResults s2 = new StatisticalResults();
                        s2.setBasename(baseName);
                        s2.setPricecount(0);
                        z.add(i, s2);
                    }
                }
            }
        }
        return z;
    }
}
