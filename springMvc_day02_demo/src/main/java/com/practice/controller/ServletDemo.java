package com.practice.controller;

import com.practice.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo1")
public class ServletDemo {

    @RequestMapping(path = "ajax")
    public @ResponseBody User ajaxDemo(@RequestBody User user){
        System.out.println("ajax执行了！！1");
        System.out.println(user);
        user.setMoney(200);
        user.setName("李四");
        return user;
    }
}
