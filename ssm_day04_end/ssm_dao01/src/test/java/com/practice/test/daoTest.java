package com.practice.test;

import com.practice.dao.ItemsDao;
import com.practice.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class daoTest {

    @Test
    public void test01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items);
    }
}
