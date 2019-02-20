package com.taotao.service;

import com.taotao.pojo.TbItem;

public interface ItemService {

    /**
     * 根据itemId查询商品
     * @param itemId
     * @return
     */
    public TbItem getItemById(long itemId);
}
