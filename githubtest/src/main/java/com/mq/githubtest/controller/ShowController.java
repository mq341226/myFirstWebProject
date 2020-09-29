package com.mq.githubtest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mq.githubtest.dao.IAccountDao;
import com.mq.githubtest.domain.Account;
import com.mq.githubtest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 对账户类进行增删改查操作的控制层
 */
@Controller
public class ShowController {
    /*注入对象*/
    @Autowired
    private IAccountService accountService;
    @Autowired
    private Account account;


    /**
     * 开始页面
     * @return
     */
    @RequestMapping("/index")
    public String test(){
        return "show";
    }

    /**
     * 插入跳转页面
     * @return
     */
    @RequestMapping("/insert")
    public String insert(){
        return "add";
    }

    /**
     * 修改跳转页面
     * @return
     */
    @RequestMapping("/modify")
    public String modify(){
        return "findByID";
    }

    /**
     * 修改跳转页面
     * @return
     */
    @RequestMapping("/out")
    public String out(){
        return "delete";
    }

    /**
     * 跳转到页面显示所有用户
     * @return
     */
    @GetMapping("/find")
    public void findAllAccount(HttpServletResponse response){
        /*设置编码格式以及MIME类型*/
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json; charset=utf-8");
        //1、获取数据库中所有的账户记录
        List<Account> accounts = accountService.findAll();
//        System.out.println(accounts);
        //2、将获取到的账户列表转换为json对象
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(accounts);
//            System.out.println(json);
            response.getWriter().write(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 通过Id查找账户信息
     * @param id
     */
    @GetMapping("/findByID")
    public String findById(String id,HttpServletRequest request){
//        System.out.println(id);
        account = accountService.findById(id);
//        System.out.println(account);
        request.setAttribute("account",account);
        return "update";
    }

    /**
     * 向数据库中增加用户的方法
     * @param name
     * @param money
     * @return
     */
    @PostMapping("/add")
    public String addAccount(String name,Double money){
        account.setName(name);
        account.setMoney(money);
//        System.out.println(account);
        accountService.insertAccount(account);
        return "success";
    }

    /**
     * 更新数据库中的账户信息(修改)
     * @param name
     * @return
     */
    @RequestMapping("/updata")
    public String updataAccount(Integer id,String name,double money){
        account.setId(id);
        account.setName(name);
        account.setMoney(money);
//        System.out.println(account);
        accountService.updateAccount(account);
        return "success";
    }

    /**
     * 通过id删除账户
     * @param id 账户id
     * @return
     */
    @PostMapping("/delete")
    public String deleteAccount(String id){
        accountService.deleteAccount(id);
        return "success";
    }
}
