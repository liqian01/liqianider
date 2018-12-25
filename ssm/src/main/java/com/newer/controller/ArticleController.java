package com.newer.controller;

import com.newer.dao.ArticleMapper;
import com.newer.domain.Article;
import com.newer.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
//当前Controller所有方法返回值都是自动转换成json数据响应给客户端
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
   private ArticleService articleService;
    //@ResponseBody
    //将方法返回值自动转换成json数据返回给客户端
    @RequestMapping(method = RequestMethod.GET )
 public List<Article>findAll(){
     return  articleService.findAll();

 }
}
