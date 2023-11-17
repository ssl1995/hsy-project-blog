package com.sangeng.sangengframework.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.sangengframework.entity.Article;
import com.sangeng.sangengframework.mapper.ArticleMapper;
import com.sangeng.sangengframework.service.ArticleService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
