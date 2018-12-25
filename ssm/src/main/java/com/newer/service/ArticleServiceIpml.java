package com.newer.service;

import com.newer.dao.ArticleMapper;
import com.newer.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("articleService")
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class ArticleServiceIpml implements ArticleService {
    @Autowired
  private ArticleMapper articleMapper;
    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            rollbackFor = Exception.class)
    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public Article findbyId(int Id) {
        return articleMapper.findbyId(Id);
    }

    @Override
    public List<Article> findAll() {
        return articleMapper.findAll();
    }

}
