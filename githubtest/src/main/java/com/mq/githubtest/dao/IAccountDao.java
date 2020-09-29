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

    /**
     * 通过Id查找账户
     * @return
     */
    Account findById(String id);

    /**
     * 插入账户(增加)
     */
    void insertAccount(Account account);

    /**
     * 更新账户信息
     * @param account
     */
    void updataAccount(Account account);

    /**
     * 根据Id进行删除操作
     * @param id
     */
    void deleteAccount(String id);
}

