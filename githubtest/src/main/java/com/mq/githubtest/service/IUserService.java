package com.mq.githubtest.service;

import com.mq.githubtest.domain.User;
import org.springframework.stereotype.Service;

/**
 * 用户的业务层接口
 */

public interface IUserService {
    /**
     * 根据用户名和密码查询用户
     * @param uname
     * @param password
     * @return
     */
    User findUser(String uname,String password);
}
