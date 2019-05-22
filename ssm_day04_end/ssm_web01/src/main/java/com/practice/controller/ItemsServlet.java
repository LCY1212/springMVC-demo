package com.practice.controller;

import com.practice.domain.Items;
import com.practice.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsServlet {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public String findById(Model model){

        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
