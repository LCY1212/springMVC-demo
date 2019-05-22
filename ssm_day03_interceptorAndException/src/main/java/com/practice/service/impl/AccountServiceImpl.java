package com.practice.service.impl;

import com.practice.dao.AccountDao;
import com.practice.domain.Account;
import com.practice.exception.Myexception;
import com.practice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() throws Myexception {

        try {
            System.out.println("业务层：查询所有账户...");
//            System.out.println(1 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Myexception("service异常了");
        }

        return accountDao.findAll();
    }

    public void saveAccount(Account account) {
        System.out.println("业务层：保存帐户...");
        accountDao.saveAccount(account);

    }
}
