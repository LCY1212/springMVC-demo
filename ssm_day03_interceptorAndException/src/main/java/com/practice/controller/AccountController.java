package com.practice.controller;

import com.practice.domain.Account;
import com.practice.exception.Myexception;
import com.practice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 帐户web
 */
@Controller
@RequestMapping
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) throws Myexception {
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    /**
     * 保存
     *
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath() + "/findAll");
    }

    /**
     * 登录
     *
     * @param name
     * @param password
     * @param session
     * @return
     */

    @RequestMapping("/login")
    public String login(@RequestParam(name = "username") String name, String password, HttpSession session) {
        session.setAttribute("user", name);
        return "redirect:homepage.jsp";
    }

}
