package com.practice.service;

import com.practice.domain.Account;
import com.practice.exception.Myexception;

import java.util.List;

public interface AccountService {

    // 查询所有账户
    public List<Account> findAll() throws Myexception;

    // 保存帐户信息
    public void saveAccount(Account account);

}
