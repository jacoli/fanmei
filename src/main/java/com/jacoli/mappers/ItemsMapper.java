package com.jacoli.mappers;

import com.jacoli.DO.ItemDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lichuange on 2017/8/15.
 */
@Repository
@Mapper
public interface ItemsMapper {

    List<ItemDO> getItems();

    ItemDO getItemById(long id);
}
