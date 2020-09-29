package com.mq.githubtest.dao;

import com.mq.githubtest.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层
 */
@Mapper
public interface UserDao {
    /**
     * 根据用户名和密码查询用户
     * @param uname
     * @param password
     * @return
     */
    User findUser(String uname,String password);
}
