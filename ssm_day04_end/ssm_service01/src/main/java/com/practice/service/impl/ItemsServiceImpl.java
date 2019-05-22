package com.practice.service.impl;

import com.practice.dao.ItemsDao;
import com.practice.domain.Items;
import com.practice.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ItemsService")
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    @Override
    public Items findById(Integer id) {
        Items items = itemsDao.findById(id);
        return items;
    }
}
