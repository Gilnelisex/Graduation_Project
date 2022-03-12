package com.example.test.controller;

import com.example.test.domain.Activity;
import com.example.test.domain.Joininfo;
import com.example.test.domain.Users;
import com.example.test.service.ActivityService;
import com.example.test.service.JoininfoService;
import com.example.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JoinInfoController {

    @Autowired
    JoininfoService joininfoService;

    @Autowired
    UsersService usersService;

    @Autowired
    ActivityService activityService;

    @GetMapping("/joinInfoManage")
    public String reviewManage(Joininfo joininfo, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveJoinInfo", joininfo);
        } else {
            joininfo = (Joininfo) session.getAttribute("selectiveJoinInfo");
        }
        //查询
        List<Joininfo> joinInfoList = this.joininfoService.selectAllJoinInfo(joininfo, pageNum, 5);
        //保存数据请请求作用域
        model.addAttribute("joinInfoList", joinInfoList);
        return "management/joinInfoManage/joinInfoManage";
    }

    @GetMapping("/getQrJoinInfo/{id}")
    public String getgetQrJoinInfo(@PathVariable("id") Integer id, Model model) {
        Joininfo joininfo = this.joininfoService.selectByPrimaryKey(id);
        Activity activity = this.activityService.selectByPrimaryKey(joininfo.getActid());
        Users user = this.usersService.selectByPrimaryKey(joininfo.getUserid());
        model.addAttribute("joininfo", joininfo);
        model.addAttribute("activity", activity);
        model.addAttribute("user", user);
        return "management/joinInfoManage/qrJoinInfo";
    }

    @PutMapping("/qrJoinInfo")
    public String QrJoinInfo(Joininfo joininfo) {
        if(this.joininfoService.updateByPrimaryKeySelective(joininfo) == 1) {
            return "redirect:/joinInfoManage";
        }else {
            return "redirect:/joinInfoManage";
        }
    }

    @GetMapping("/getQxJoinInfo/{id}")
    public String getQxJoinInfo(@PathVariable("id") Integer id, Model model) {
        Joininfo joininfo = this.joininfoService.selectByPrimaryKey(id);
        model.addAttribute("joininfo", joininfo);
        return "management/joinInfoManage/qxJoinInfo";
    }

    @PutMapping("/qxJoinInfo")
    public String QxJoinInfo(Joininfo joininfo) {
        if(this.joininfoService.updateByPrimaryKeySelective(joininfo) == 1) {
            return "redirect:/joinInfoManage";
        }else {
            return "redirect:/joinInfoManage";
        }
    }

    @GetMapping("/getDeleteJoinInfo/{id}")
    public String getDeleteJoinInfo(@PathVariable("id") Integer id, Model model) {
        Joininfo joininfo = this.joininfoService.selectByPrimaryKey(id);
        model.addAttribute("joininfo", joininfo);
        return "management/joinInfoManage/deleteJoinInfo";
    }

    @PutMapping("/deleteJoinInfo")
    public String DeleteJoinInfo(Joininfo joininfo) {
        if(this.joininfoService.updateByPrimaryKeySelective(joininfo) == 1) {
            return "redirect:/joinInfoManage";
        }else {
            return "redirect:/joinInfoManage";
        }
    }
}
