package com.sangeng.sangengframework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.sangengframework.entity.Article;
import com.sangeng.sangengframework.mapper.ArticleMapper;
import com.sangeng.sangengframework.service.ArticleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
