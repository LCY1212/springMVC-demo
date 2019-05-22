package com.lcy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestServlet {

    @RequestMapping("/haha")
    public String Test1(){
        System.out.println("测试springMVC入门");
        return "success";
    }
}
