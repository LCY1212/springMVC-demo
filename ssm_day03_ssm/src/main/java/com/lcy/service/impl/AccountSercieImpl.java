package com.lcy.service.impl;

import com.lcy.dao.AccountDao;
import com.lcy.domain.Account;
import com.lcy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountService")
public class AccountSercieImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
