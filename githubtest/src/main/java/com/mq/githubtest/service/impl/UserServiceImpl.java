package com.mq.githubtest.service.impl;

import com.mq.githubtest.dao.UserDao;
import com.mq.githubtest.domain.User;
import com.mq.githubtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户的业务层实现类
 */
@Service
public class UserServiceImpl implements IUserService {
    /*注入对象*/
    @Autowired
    private UserDao userDao;

    /**
     * 根据用户名和密码查询用户
     * @param uname
     * @param password
     * @return
     */
    @Override
    public User findUser(String uname, String password) {
        return userDao.findUser(uname,password);
    }
}
