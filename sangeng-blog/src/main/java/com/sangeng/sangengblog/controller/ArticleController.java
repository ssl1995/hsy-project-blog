package com.sangeng.sangengblog.controller;

import com.sangeng.sangengframework.entity.Article;


import com.sangeng.sangengframework.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;


    @GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }
}
