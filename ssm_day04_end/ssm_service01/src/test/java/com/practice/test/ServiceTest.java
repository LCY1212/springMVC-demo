package com.practice.test;

import com.practice.domain.Items;
import com.practice.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test
    public void  test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-service.xml");
        ItemsService itemsService = ac.getBean(ItemsService.class);
        Items byId = itemsService.findById(1);
        System.out.println(byId);
    }
}
