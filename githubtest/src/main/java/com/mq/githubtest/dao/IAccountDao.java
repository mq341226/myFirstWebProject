package com.mq.githubtest.dao;

import com.mq.githubtest.domain.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 账户持久层
 */
@Mapper
public interface IAccountDao {
    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAll();
}
