package com.taotao.service.impl;

import com.arthur.common.EasyUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类service
 *
 * @author wangss
 * @create 2019-03-09 15:30
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper mapper;

    @Override
    public List<EasyUITreeNode> getItemCatList(long parentId) {
        // 根据父节点id查询子节点列表
        TbItemCatExample example = new TbItemCatExample();
        // 设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
        // 设置parentId
        criteria.andParentIdEqualTo(parentId);
        // 执行查询
        List<TbItemCat> list = mapper.selectByExample(example);
        // 转换为easyuitreenode列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat bean : list) {
            EasyUITreeNode easyUITreeNode = new EasyUITreeNode();
            easyUITreeNode.setId(bean.getId());
            easyUITreeNode.setText(bean.getName());
            // 如果节点下有子节点"closed",如果没有子节点"open"
            easyUITreeNode.setState(bean.getIsParent() ? "closed" : "open");
            resultList.add(easyUITreeNode);
        }
        return resultList;
    }
}
