package com.jacoli.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jacoli.DO.ItemDO;
import com.jacoli.mappers.ItemsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lichuange on 2017/8/15.
 */
@RestController
@RequestMapping("/items")
public class ItemsController {
    private Logger logger = LoggerFactory.getLogger(ItemsController.class);

    @Autowired
    private ItemsMapper itemsMapper;

    /*返回商品列表*/
    @RequestMapping("/list")
    public String getItems() {
//        List<ItemDO> items = new ArrayList<>();
//        ItemDO item1 = new ItemDO();
//        item1.setId(1);
//        items.add(item1);
//
//        ItemDO item2 = new ItemDO();
//        item2.setId(2);
//        items.add(item2);
//
//        ItemDO item3 = new ItemDO();
//        item3.setId(3);
//        items.add(item3);

        List<ItemDO> items = itemsMapper.getItems();
        Gson gson = new GsonBuilder().create();
        return gson.toJson(items);
    }

    /*返回商品详情*/
    @RequestMapping("detail")
    public String getItem(long id) {
        ItemDO item1 = new ItemDO();
        item1.setId(id);

        Gson gson = new GsonBuilder().create();
        return gson.toJson(item1);
    }
}
