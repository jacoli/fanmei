package com.jacoli.services;

import com.jacoli.DO.ItemDO;
import com.jacoli.mappers.ItemsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lichuange on 2017/8/15.
 */
@Component
public class ItemService {
    private Logger logger = LoggerFactory.getLogger(ItemService.class);

    @Autowired
    private ItemsMapper itemsMapper;

    public List<ItemDO> getOnlineItems() {
        List<ItemDO> items = itemsMapper.getItems();
        return items.stream().filter(item -> item.isOnline()).collect(Collectors.toList());
    }
}
