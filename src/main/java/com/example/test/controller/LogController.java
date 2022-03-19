package com.example.test.controller;

import com.example.test.domain.Managers;
import com.example.test.service.ManagersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LogController {

    @Autowired
    ManagersService managersService;

    @GetMapping("/")
    public String voids(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    Managers managers = this.managersService.selectByPrimaryKey(Integer.parseInt(token));
                    if (managers != null) {
                        if (managers.getManagerstatus() == 1) {
                            request.getSession().setAttribute("manager", managers);
                            return "redirect:/management";
                        } else {
                            return "redirect:/logout";
                        }
                    }
                }
            }
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(Managers manager, String verify, Model model, HttpServletRequest request, HttpServletResponse response) {
        Managers managers = this.managersService.selectManager(manager);
        String code = (String) request.getSession().getAttribute("VerifyCode");
        verify = verify.toUpperCase();
        code = code.toUpperCase();
        if (verify.equals(code)) {
            if (managers != null) {
                if (managers.getManagerstatus() == 1) {
                    request.getSession().setAttribute("manager", managers);
                    Cookie cookie = new Cookie("token", (managers.getId()).toString());
                    cookie.setMaxAge(86400);
                    response.addCookie(cookie);
                    return "redirect:/management";
                } else {
                    model.addAttribute("fail", "账号被限制，请联系管理员!");
                    return "login";
                }
            } else {
                model.addAttribute("fail", "账号或密码错误!");
                return "login";
            }
        } else {
            model.addAttribute("fail", "验证码错误!");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    HttpSession session = request.getSession();
                    session.invalidate();
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }
        return "redirect:/";
    }
}
