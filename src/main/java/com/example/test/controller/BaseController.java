package com.example.test.controller;

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
public class BaseController {

    @Autowired
    BaseService baseService;

    @Autowired
    ActivityService activityService;

    @GetMapping("/baseManage")
    public String baseManage(Base base, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveBase", base);
        } else {
            base = (Base) session.getAttribute("selectiveBase");
        }
        //查询
        List<Base> typeList = this.baseService.selectAllType();
        List<Base> baseList = this.baseService.selectAllBase(base, pageNum, 5);
        //保存数据请请求作用域
        model.addAttribute("typeList", typeList);
        model.addAttribute("baseList", baseList);
        return "management/baseManage/baseManage";
    }

    @GetMapping("/getInsertBase")
    public String getInsertBase(Model model) {
        List<Base> baseType = this.baseService.selectAllType();
        model.addAttribute("typeList", baseType);
        return "management/baseManage/insertBase";
    }

    @PutMapping("/insertBase")
    public String insertBase(Base base) {
        if(this.baseService.insertSelective(base) == 1) {
            return "redirect:/baseManage";
        }else {
            return "redirect:/baseManage";
        }
    }

    @GetMapping("/getUpdateBase/{id}")
    public String getUpdateBase(@PathVariable("id") Integer id, Model model) {
        Base base = this.baseService.selectByPrimaryKey(id);
        List<Base> typeList = this.baseService.selectAllType();
        model.addAttribute("typeList", typeList);
        model.addAttribute("base", base);
        return "management/baseManage/updateBase";
    }

    @PutMapping("/updateBase")
    public String updateBase(Base base) {
        if(this.baseService.updateByPrimaryKeySelective(base) == 1) {
            return "redirect:/baseManage";
        }else {
            return "redirect:/baseManage";
        }
    }

    @GetMapping("/getSjBase/{id}")
    public String getSjBase(@PathVariable("id") Integer id, Model model) {
        Base base = this.baseService.selectByPrimaryKey(id);
        model.addAttribute("base", base);
        return "management/baseManage/sjBase";
    }

    @PutMapping("/sjBase")
    public String sjBase(Base base) {
        if(this.baseService.updateByPrimaryKeySelective(base) == 1) {
            return "redirect:/baseManage";
        }else {
            return "redirect:/baseManage";
        }
    }

    @GetMapping("/getXjBase/{id}")
    public String getXjBase(@PathVariable("id") Integer id, Model model) {
        Base base = this.baseService.selectByPrimaryKey(id);
        model.addAttribute("base", base);
        return "management/baseManage/xjBase";
    }

    @PutMapping("/xjBase")
    public String xjBase(Base base) {
        int id = base.getId();
        if(this.baseService.updateByPrimaryKeySelective(base) == 1) {
            this.activityService.updateByField(id);
            return "redirect:/baseManage";
        }else {
            return "redirect:/baseManage";
        }
    }

    @GetMapping("/getDeleteBase/{id}")
    public String getDeleteBase(@PathVariable("id") Integer id, Model model) {
        Base base = this.baseService.selectByPrimaryKey(id);
        model.addAttribute("base", base);
        return "management/baseManage/deleteBase";
    }

    @PutMapping("/deleteBase")
    public String deleteBase(Base base) {
        int id = base.getId();
        if(this.baseService.updateByPrimaryKeySelective(base) == 1) {
            this.activityService.updateByField(id);
            return "redirect:/baseManage";
        }else {
            return "redirect:/baseManage";
        }
    }
}
