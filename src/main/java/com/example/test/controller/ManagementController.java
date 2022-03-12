package com.example.test.controller;

import com.example.test.domain.Managers;
import com.example.test.domain.Users;
import com.example.test.service.ManagersService;
import com.example.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ManagementController {

    @Autowired
    ManagersService managersService;

    @Autowired
    UsersService usersService;

    @GetMapping("/management")
    public String management() {
        return "management/homePage";
    }

    @GetMapping("/personalCenter")
    public String personalCenterBase() {
        return "management/personalCenter";
    }

    @PutMapping("/personalCenter-change")
    public String personalCenterChange(Managers manager) {
        if (this.managersService.updateByPrimaryKeySelective(manager) == 1) {
            return "redirect:/personalCenter";
        } else {
            return "redirect:/personalCenter";
        }
    }

    @GetMapping("/passwordChange")
    public String passwordChange() {
        return "management/passwordChange";
    }

    @GetMapping("/managerManage")
    public String managerManage(Managers manager, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveManager", manager);
        } else {
            manager = (Managers) session.getAttribute("selectiveManager");
        }
        //查询
        List<Managers> managersList = this.managersService.selectAllManager(manager, pageNum, 5);
        //保存数据请请求作用域
        model.addAttribute("managersList", managersList);
        return "management/managerManage";
    }

    @GetMapping("/getInsertManager")
    public String getInsertManager() {
        return "management/insertManager";
    }

    @PostMapping("/insertManager")
    public String insertManager(Managers manager) {
        if (this.managersService.insertSelective(manager) == 1) {
            return "redirect:/managerManage";
        } else {
            return "redirect:/managerManage";
        }
    }

    @GetMapping("/getChangeManager/{id}")
    public String getChangeManager(@PathVariable("id") Integer id, Model model) {
        Managers managers = this.managersService.selectByPrimaryKey(id);
        model.addAttribute("manager", managers);
        return "management/changeManager";
    }

    @PutMapping("/changeManager")
    public String changeManager(Managers managers) {
        if (this.managersService.updateByPrimaryKeySelective(managers) == 1) {
            return "redirect:/managerManage";
        } else {
            return "redirect:/managerManage";
        }
    }

    @GetMapping("/getDeleteManager/{id}")
    public String getDeleteManager(@PathVariable("id") Integer id, Model model) {
        Managers managers = this.managersService.selectByPrimaryKey(id);
        model.addAttribute("manager", managers);
        return "management/deleteManager";
    }

    @PutMapping("/deleteManager")
    public String deleteManager(Managers managers) {
        if (this.managersService.updateByPrimaryKeySelective(managers) == 1) {
            return "redirect:/managerManage";
        } else {
            return "redirect:/managerManage";
        }
    }

    @GetMapping("/getResetPassword/{id}")
    public String getResetPassword(@PathVariable("id") Integer id, Model model) {
        Managers managers = this.managersService.selectByPrimaryKey(id);
        model.addAttribute("manager", managers);
        return "management/resetPassword";
    }

    @PutMapping("/resetPassword")
    public String resetPassword(Managers managers) {
        if (this.managersService.updateByPrimaryKeySelective(managers) == 1) {
            return "redirect:/managerManage";
        } else {
            return "redirect:/managerManage";
        }
    }

    @GetMapping("/userManage")
    public String userManage(Users user, Integer pageNum, Model model, HttpSession session) {
        if (pageNum == null) {
            pageNum = 1;
            //保留查询条件
            session.setAttribute("selectiveUser", user);
        } else {
            user = (Users) session.getAttribute("selectiveUser");
        }
        //查询
        List<Users> usersList = this.usersService.selectAllUser(user, pageNum, 5);
        //保存数据请请求作用域
        model.addAttribute("usersList", usersList);
        return "management/userManage";
    }
    @GetMapping("/getInsertUser")
    public String getInsertUser() {
        return "management/insertUser";
    }

    @PostMapping("/insertUser")
    public String insertUser(Users user) {
        if (this.usersService.insertSelective(user) == 1) {
            return "redirect:/userManage";
        } else {
            return "redirect:/userManage";
        }
    }

    @GetMapping("/getChangeUser/{id}")
    public String getChangeUser(@PathVariable("id") Integer id, Model model) {
        Users users = this.usersService.selectByPrimaryKey(id);
        model.addAttribute("user", users);
        return "management/changeUser";
    }

    @PutMapping("/changeUser")
    public String changeUser(Users users) {
        if (this.usersService.updateByPrimaryKeySelective(users) == 1) {
            return "redirect:/userManage";
        } else {
            return "redirect:/userManage";
        }
    }

    @GetMapping("/getDeleteUser/{id}")
    public String getDeleteUser(@PathVariable("id") Integer id, Model model) {
        Users users = this.usersService.selectByPrimaryKey(id);
        model.addAttribute("user", users);
        return "management/deleteUser";
    }

    @PutMapping("/deleteUser")
    public String deleteUser(Users users) {
        if (this.usersService.updateByPrimaryKeySelective(users) == 1) {
            return "redirect:/userManage";
        } else {
            return "redirect:/userManage";
        }
    }

    @GetMapping("/getResetPasswordu/{id}")
    public String getResetPasswordu(@PathVariable("id") Integer id, Model model) {
        Users users = this.usersService.selectByPrimaryKey(id);
        model.addAttribute("user", users);
        return "management/resetPasswordu";
    }

    @PutMapping("/resetPasswordu")
    public String resetPasswordu(Users users) {
        if (this.usersService.updateByPrimaryKeySelective(users) == 1) {
            return "redirect:/userManage";
        } else {
            return "redirect:/userManage";
        }
    }
}
