package com.newer.service;

import com.newer.domain.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {

    int addArticle(Article article);
    Article findbyId(@Param("Id") int Id) ;
    List<Article> findAll();

}
