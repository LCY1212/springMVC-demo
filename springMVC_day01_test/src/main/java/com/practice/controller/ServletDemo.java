package com.practice.controller;

import com.practice.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("demo1")
public class ServletDemo {

    @RequestMapping("save")
    public String save() {
        System.out.println("保存账户成功！！！！！");
        return "success";
    }

    @RequestMapping(path = "getParams", params = "money=2000", headers = "Accept", method = RequestMethod.POST)
    public String getParams(@RequestParam(required = false, defaultValue = "默认的名字") String name,
                            @RequestParam(required = false) Float money,
                            Integer age) {
        System.out.println("获取参数");
        System.out.println(name + " : " + age + " : " + money);
        return "success";
    }

    @RequestMapping(path = "{sid}", method = RequestMethod.POST)
    public String findAccount(@PathVariable(name = "sid") String id, Account account) {
        System.out.println(id);
        System.out.println("获取用户信息！！！！！！！！");
        System.out.println(account);
        return "success";
    }

}
