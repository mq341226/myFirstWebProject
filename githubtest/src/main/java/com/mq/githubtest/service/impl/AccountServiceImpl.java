package com.mq.githubtest.service.impl;

import com.mq.githubtest.dao.IAccountDao;
import com.mq.githubtest.domain.Account;
import com.mq.githubtest.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层的实现类
 */
@Service
public class AccountServiceImpl implements IAccountService {
    /*注入对象*/
    @Autowired
    private IAccountDao accountDao;

    /**
     * 查询所以账户的实现方法
     * @return
     */
    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    /**
     * 通过id查询账户的实现方法
     * @param id
     * @return
     */
    @Override
    public Account findById(String id) {
        return accountDao.findById(id);
    }

    /**
     * 插入账户的实现方法
     * @param account
     */
    @Transactional
    @Override
    public void insertAccount(Account account) {
        accountDao.insertAccount(account);
    }

    /**
     * 修改账户的实现方法
     * @param account
     */
    @Transactional
    @Override
    public void updateAccount(Account account) {
        accountDao.updataAccount(account);
    }

    /**
     * 删除账户的实现方法
     * @param id
     */
    @Transactional
    @Override
    public void deleteAccount(String id) {
        accountDao.deleteAccount(id);
    }
}
