package com.mq.githubtest.service;

import com.mq.githubtest.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层操作
 */

public interface IAccountService {
    /**
     * 查询所有账户接口方法
     * @return
     */
    List<Account> findAll();

    /**
     * 根据Id进行查询账户接口方法
     * @param id
     * @return
     */
    Account findById(String id);

    /**
     * 插入账户接口方法
     * @param account
     */
    void insertAccount(Account account);

    /**
     * 修改账户接口方法
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 根据Id删除账户的接口方法
     * @param id
     */
    void deleteAccount(String id);
}
