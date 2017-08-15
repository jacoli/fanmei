package com.jacoli.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jacoli.DO.ItemDO;
import com.jacoli.mappers.ItemsMapper;
import com.jacoli.services.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lichuange on 2017/8/15.
 */
@RestController
@RequestMapping("/items")
public class ItemsController {
    private Logger logger = LoggerFactory.getLogger(ItemsController.class);

    @Autowired
    private ItemsMapper itemsMapper;

    @Autowired
    private ItemService itemService;

    /*返回商品列表*/
    @RequestMapping("/list")
    public String getItems() {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(itemService.getOnlineItems());
    }

    /*返回商品详情*/
    @RequestMapping("detail")
    public String getItem(long id) {
        ItemDO item1 = new ItemDO();
        item1.setId(id);

        Gson gson = new GsonBuilder().create();
        return gson.toJson(item1);
    }

    /*返回商品详情*/
    @RequestMapping("delete")
    public String deleteItem(long id) {
        itemsMapper.softDeleteItem(id);
        return "success";
    }
}
