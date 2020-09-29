package com.mq.githubtest.controller;

import com.mq.githubtest.domain.User;
import com.mq.githubtest.service.IUserService;
import com.mq.githubtest.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 进行登录验证的控制层
 */
@Controller
public class LoginController {
    /*注入对象*/
    @Autowired
    private IUserService userService;

    /**
     * 进入登录页面
     * @return
     */
    @GetMapping("/loginStart")
    public String loginStrat(){
        return "login";
    }

    /**
     * 登录方法
     * @return
     */
    @PostMapping("/login")
    public String login(String uname,String password){
        User user = userService.findUser(uname, password);
        System.out.println(user);
        String inf= null;
        if (user==null){
            inf = "error1";
        }else {
            inf = "show";
        }
        return inf;
    }
}
