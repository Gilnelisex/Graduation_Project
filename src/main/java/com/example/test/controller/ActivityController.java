package com.example.test.controller;

import com.example.test.domain.Activity;
import com.example.test.domain.Base;
import com.example.test.service.ActivityService;
import com.example.test.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ActivityController {

    @Autowired
    ActivityService activityService;

    @Autowired
    BaseService baseService;

    @GetMapping("/activityManage")
    public String activityManage(Activity activity, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveActivity", activity);
        } else {
            activity = (Activity) session.getAttribute("selectiveActivity");
        }
        //查询
        List<Base> baseList = this.baseService.selectAllBaseName();
        List<Activity> typeList = this.activityService.selectAllType();
        List<Activity> activityList = this.activityService.selectAllActivity(activity, pageNum, 5);
        //保存数据请请求作用域
        model.addAttribute("baseList", baseList);
        model.addAttribute("typeList", typeList);
        model.addAttribute("activityList", activityList);
        return "management/activityManage/activityManage";
    }

    @GetMapping("/getInsertActivity")
    public String getInsertActivity(Model model) {
        List<Base> baseList = this.baseService.selectAllBaseName();
        List<Activity> typeList = this.activityService.selectAllType();
        List<Activity> harvestList = this.activityService.selectAllHarvest();
        model.addAttribute("baseList", baseList);
        model.addAttribute("typeList", typeList);
        model.addAttribute("harvestList", harvestList);
        return "management/activityManage/insertActivity";
    }

    @PutMapping("/insertActivity")
    public String insertActivity(Activity activity) {
        if(this.activityService.insertSelective(activity) == 1) {
            return "redirect:/activityManage";
        }else {
            return "redirect:/activityManage";
        }
    }

    @GetMapping("/getUpdateActivity/{id}")
    public String getUpdateActivity(@PathVariable("id") Integer id, Model model) {
        Activity activity = this.activityService.selectByPrimaryKey(id);
        List<Base> baseList = this.baseService.selectAllBaseName();
        List<Activity> typeList = this.activityService.selectAllType();
        List<Activity> harvestList = this.activityService.selectAllHarvest();
        model.addAttribute("baseList", baseList);
        model.addAttribute("typeList", typeList);
        model.addAttribute("activity", activity);
        model.addAttribute("harvestList", harvestList);
        return "management/activityManage/updateActivity";
    }

    @PutMapping("/updateActivity")
    public String updateActivity(Activity activity) {
        if(this.activityService.updateByPrimaryKeySelective(activity) == 1) {
            return "redirect:/activityManage";
        }else {
            return "redirect:/activityManage";
        }
    }

    @GetMapping("/getSjActivity/{id}")
    public String getSjActivity(@PathVariable("id") Integer id, Model model) {
        Activity activity = this.activityService.selectByPrimaryKey(id);
        model.addAttribute("activity", activity);
        return "management/activityManage/sjActivity";
    }

    @PutMapping("/sjActivity")
    public String sjActivity(Activity activity) {
        if(this.activityService.updateByPrimaryKeySelective(activity) == 1) {
            return "redirect:/activityManage";
        }else {
            return "redirect:/activityManage";
        }
    }

    @GetMapping("/getXjActivity/{id}")
    public String getXjActivity(@PathVariable("id") Integer id, Model model) {
        Activity activity = this.activityService.selectByPrimaryKey(id);
        model.addAttribute("activity", activity);
        return "management/activityManage/xjActivity";
    }

    @PutMapping("/xjActivity")
    public String xjActivity(Activity activity) {
        if(this.activityService.updateByPrimaryKeySelective(activity) == 1) {
            return "redirect:/activityManage";
        }else {
            return "redirect:/activityManage";
        }
    }

    @GetMapping("/getDeleteActivity/{id}")
    public String getDeleteActivity(@PathVariable("id") Integer id, Model model) {
        Activity activity = this.activityService.selectByPrimaryKey(id);
        model.addAttribute("activity", activity);
        return "management/activityManage/deleteActivity";
    }

    @PutMapping("/deleteActivity")
    public String deleteActivity(Activity activity) {
        if(this.activityService.updateByPrimaryKeySelective(activity) == 1) {
            return "redirect:/activityManage";
        }else {
            return "redirect:/activityManage";
        }
    }
}
