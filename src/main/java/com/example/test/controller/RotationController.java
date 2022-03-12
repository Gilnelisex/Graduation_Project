package com.example.test.controller;

import com.example.test.domain.Activity;
import com.example.test.domain.Rotation;
import com.example.test.domain.Rotation;
import com.example.test.service.RotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class RotationController {

    @Autowired
    RotationService rotationService;

    @GetMapping("/rotationManage")
    public String rotationManage(Rotation rotation, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveRotation", rotation);
        } else {
            rotation = (Rotation) session.getAttribute("selectiveRotation");
        }
        List<Rotation> rotationList = this.rotationService.selectAllRotation(rotation, pageNum, 5);
        model.addAttribute("rotationList", rotationList);
        return "management/rotationManage/rotationManage";
    }

    @GetMapping("/getInsertRotation")
    public String getInsertRotation(Model model) {
        List<Rotation> locations = this.rotationService.selectLocation();
        model.addAttribute("locations", locations);
        return "management/rotationManage/insertRotation";
    }

    @PutMapping("/insertRotation")
    public String insertRotation(Rotation rotation) {
        if(this.rotationService.insertSelective(rotation) == 1) {
            return "redirect:/rotationManage";
        }else {
            return "redirect:/rotationManage";
        }
    }

    @GetMapping("/getUpdateRotation/{id}")
    public String getUpdateRotation(@PathVariable("id") Integer id, Model model) {
        Rotation rotation = this.rotationService.selectByPrimaryKey(id);
        model.addAttribute("rotation", rotation);
        List<Rotation> locations = this.rotationService.selectLocation();
        model.addAttribute("locations", locations);
        return "management/rotationManage/updateRotation";
    }

    @PutMapping("/updateRotation")
    public String updateRotation(Rotation rotation) {
        if(this.rotationService.updateByPrimaryKeySelective(rotation) == 1) {
            return "redirect:/rotationManage";
        }else {
            return "redirect:/rotationManage";
        }
    }

    @GetMapping("/getSjRotation/{id}")
    public String getSjRotation(@PathVariable("id") Integer id, Model model) {
        Rotation rotation = this.rotationService.selectByPrimaryKey(id);
        model.addAttribute("rotation", rotation);
        return "management/rotationManage/sjRotation";
    }

    @PutMapping("/sjRotation")
    public String sjRotation(Rotation rotation) {
        if(this.rotationService.updateByPrimaryKeySelective(rotation) == 1) {
            return "redirect:/rotationManage";
        }else {
            return "redirect:/rotationManage";
        }
    }

    @GetMapping("/getXjRotation/{id}")
    public String getXjRotation(@PathVariable("id") Integer id, Model model) {
        Rotation rotation = this.rotationService.selectByPrimaryKey(id);
        model.addAttribute("rotation", rotation);
        return "management/rotationManage/xjRotation";
    }

    @PutMapping("/xjRotation")
    public String xjRotation(Rotation rotation) {
        if(this.rotationService.updateByPrimaryKeySelective(rotation) == 1) {
            return "redirect:/rotationManage";
        }else {
            return "redirect:/rotationManage";
        }
    }

    @GetMapping("/getDeleteRotation/{id}")
    public String getDeleteRotation(@PathVariable("id") Integer id, Model model) {
        Rotation rotation = this.rotationService.selectByPrimaryKey(id);
        model.addAttribute("rotation", rotation);
        return "management/rotationManage/deleteRotation";
    }

    @PutMapping("/deleteRotation")
    public String deleteRotation(Rotation rotation) {
        if(this.rotationService.updateByPrimaryKeySelective(rotation) == 1) {
            return "redirect:/rotationManage";
        }else {
            return "redirect:/rotationManage";
        }
    }
}
