package com.baohao.departmentwebsitefrontend.controller;

import com.baohao.departmentwebsitefrontend.model.News;
import com.baohao.departmentwebsitefrontend.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewsController {
    @Resource
    private NewsService newsService;

    @RequestMapping(value = "/news", method = RequestMethod.GET)
    public String news(Model model) {
        List<News> newsList = newsService.getNewsList();
        model.addAttribute("newsList", newsList);
        return "news";
    }

    @RequestMapping(value = "/news/detail/{id}", method = RequestMethod.GET)
    public String newsDetail(@PathVariable int id, Model model) {
        News news = newsService.getNewsById(id);
        model.addAttribute("news", news);
        return "news_detail";
    }
}
