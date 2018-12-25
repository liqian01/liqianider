package com.newer.test;

import com.newer.service.ArticleService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleTest {
@Test
    public  void test1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ArticleService articleService = ctx.getBean("articleService",ArticleService.class);
        articleService.findAll().forEach(article ->
                System.out.println(article.getTitle()+":"+article.getContent()));
    }
}
