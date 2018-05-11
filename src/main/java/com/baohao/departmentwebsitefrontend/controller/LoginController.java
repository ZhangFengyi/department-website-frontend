package com.baohao.departmentwebsitefrontend.controller;

import com.baohao.departmentwebsitefrontend.common.constant.SessionConstants;
import com.baohao.departmentwebsitefrontend.model.UserInfo;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {
    private static final Long timestamp = System.currentTimeMillis();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("timestamp", timestamp);
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model) {
        Subject subject = SecurityUtils.getSubject();
        UserInfo userInfo = (UserInfo) subject.getSession().getAttribute(SessionConstants.ATTR_USER);
        if (userInfo == null) {
            return "login";
        } else {
            return "redirect:/";
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, Model model) {
        String message;
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            message = "用户名和密码不能为空！";
            model.addAttribute("message", message);
            return "login";
        }
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(StringUtils.trim(username), StringUtils.trim(password));
            Subject subject = SecurityUtils.getSubject();
            subject.login(usernamePasswordToken);
            if (subject.isAuthenticated()) {
                return "redirect:/";
            } else {
                return "login";
            }
        } catch (IncorrectCredentialsException | UnknownAccountException e) {
            message = "用户名或密码错误！";
        }
        model.addAttribute("message", message);
        return "login";
    }
}
