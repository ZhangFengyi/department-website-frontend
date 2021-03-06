package com.baohao.departmentwebsitefrontend.controller;

import com.baohao.departmentwebsitefrontend.common.constant.SessionConstants;
import com.baohao.departmentwebsitefrontend.model.FnInfo;
import com.baohao.departmentwebsitefrontend.model.News;
import com.baohao.departmentwebsitefrontend.model.UserInfo;
import com.baohao.departmentwebsitefrontend.service.MenuService;
import com.baohao.departmentwebsitefrontend.service.NewsService;
import com.baohao.departmentwebsitefrontend.service.VisitService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {
    private static final Long timestamp = System.currentTimeMillis();

    @Resource
    private MenuService menuService;

    @Resource
    private VisitService visitService;

    @Resource
    private NewsService newsService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("timestamp", timestamp);
        List<FnInfo> fnInfoList = menuService.getSortedFnInfoList();
        model.addAttribute("fnInfoList", fnInfoList);
        List<News> newsList = newsService.getNewsList();
        model.addAttribute("newsList", newsList);
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
                visitService.addVisitInfo((UserInfo) subject.getSession().getAttribute(SessionConstants.ATTR_USER));
                return "redirect:/";
            } else {
                return "login";
            }
        } catch (IncorrectCredentialsException | UnknownAccountException e) {
            message = "用户名或密码错误！";
        } catch (ExcessiveAttemptsException e) {
            message = "excessive attemptes";
        } catch (LockedAccountException e) {
            message = "the user has been locked";
        } catch (DisabledAccountException e) {
            message = "the user has been disabled";
        } catch (ExpiredCredentialsException e) {
            message = "user expires";
        } catch (UnauthorizedException e) {
            message = "not authorized." + e.getMessage();
        } catch (AuthenticationException e) {
            message = e.getMessage();
        }
        model.addAttribute("message", message);
        return "login";
    }
}
