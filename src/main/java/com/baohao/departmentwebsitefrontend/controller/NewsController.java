package com.baohao.departmentwebsitefrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {
    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String news(Model model) {
        return "news";
    }

    @RequestMapping(value = "/news/detail", method = RequestMethod.GET)
    public String newsDetail(Model model) {
        return "news_detail";
    }
}
