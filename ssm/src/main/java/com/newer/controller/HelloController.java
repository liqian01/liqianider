package com.newer.controller;

import com.newer.dao.ArticleMapper;
import com.newer.domain.Article;
import com.newer.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @Autowired
    private ArticleMapper articleMapper;
    @RequestMapping("/hello")
    public  String hello(){
        System.out.println("hello方法被调用");
        return "index";//视图名
    }
    @RequestMapping("/login")
    public  String login(String username,String pwd){
        System.out.println(username);
        return "index";
    }//不会当做模型，只会当做普通参数
    @RequestMapping("/login1")
    public  String login(User user){
        System.out.println(user.getUsername()+"--"+user.getPassword());
        return "index";
    }
    @RequestMapping("/articlelist")
    public  String list(Map<String,Object> map){
    List<Article> list =articleMapper.findAll();
    map.put("list",list);
    return "articlelist";
    }
}
