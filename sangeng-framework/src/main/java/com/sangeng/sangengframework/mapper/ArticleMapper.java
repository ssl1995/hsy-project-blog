package com.sangeng.sangengframework.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sangeng.sangengframework.entity.Article;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
}
