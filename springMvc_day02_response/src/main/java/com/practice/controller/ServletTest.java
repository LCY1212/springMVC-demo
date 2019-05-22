package com.practice.controller;

import com.practice.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class ServletTest {

    @RequestMapping("{id}")
    public ModelAndView findById(@PathVariable Integer id) {
        System.out.println(id);
        User user = new User();
        user.setId(id);
        user.setName("老王");
        user.setMoney((float) 1000);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @ModelAttribute
    public void initUser(Model model){
        User user = new User();
        user.setId(10);
        model.addAttribute("userId",user);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String setUser(@ModelAttribute("userId") User user){
        System.out.println(user);
        return "forward:\\WEB-INF\\pages\\success.jsp";
    }
}
