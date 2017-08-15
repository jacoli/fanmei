package com.jacoli.mappers;

import com.jacoli.DO.ItemDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lichuange on 2017/8/15.
 */
@Repository
@Mapper
public interface ItemsMapper {

    int insert(ItemDO insertDO);

    int update(ItemDO newDO);

    void deleteItem(long id);

    void softDeleteItem(long id);

    List<ItemDO> getItems();

    ItemDO getItemById(long id);

    ItemDO getById(@Param("id") long itemId);
}
