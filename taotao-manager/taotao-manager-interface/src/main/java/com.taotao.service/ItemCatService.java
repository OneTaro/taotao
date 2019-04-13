package com.taotao.service;

import com.arthur.common.EasyUITreeNode;

import java.util.List;

public interface ItemCatService {

    /**
     * 获取商品类目
     * @param parentId
     * @return
     */
    public List<EasyUITreeNode> getItemCatList(long parentId);
}
