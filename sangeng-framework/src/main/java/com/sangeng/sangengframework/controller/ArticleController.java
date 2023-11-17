package com.sangeng.sangengframework.controller;

import com.sangeng.sangengframework.entity.Article;
import com.sangeng.sangengframework.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @GetMapping("/list")
    public void test(){
        int a =1;
        System.out.println(a);
        articleService.list();
    }
}
