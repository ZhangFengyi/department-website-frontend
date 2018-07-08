package com.baohao.departmentwebsitefrontend.service;

import com.baohao.departmentwebsitefrontend.dao.NewsMapper;
import com.baohao.departmentwebsitefrontend.model.News;
import com.baohao.departmentwebsitefrontend.model.NewsExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsService {
    @Resource
    private NewsMapper newsMapper;

    public List<News> getNewsList() {
        NewsExample example = new NewsExample();
        example.setOrderByClause("publish_time DESC");
        List<News> newsList = newsMapper.selectByExample(example);
        return newsList;
    }

    public News getNewsById(int id) {
        News news = newsMapper.selectByPrimaryKey(id);
        return news;
    }
}
