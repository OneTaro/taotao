package com.taotao.service;

import com.arthur.common.EasyUIDataGridResult;
import com.arthur.common.EasyUITreeNode;
import com.taotao.pojo.TbItem;

public interface ItemService {

    /**
     * 根据itemId查询商品
     * @param itemId
     * @return
     */
    public TbItem getItemById(long itemId);

    /**
     * 获取商品列表
     * @param page
     * @param rows
     * @return
     */
    public EasyUIDataGridResult getItemList(int page, int rows);
}
