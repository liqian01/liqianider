package com.newer.controller;

import com.newer.domain.User;
import com.newer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;
@Controller
@RequestMapping("/user")
//注在类上面，表示一级访问路径
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("userName") String userName,
                        @RequestParam("password") String password,
                        ModelMap modelMap,
                        HttpSession session){
        //Map,Model,ModelMap代表模型数据集合
        User user=userService.login(userName,password);
        if(user==null){
            modelMap.put("msg","用户名或密码错误！");
            return "login";
        }else{
            session.setAttribute("loginer",user);
            return "redirect:/index.jsp";
        }
    }

}
