package com.arthur.common;

import java.io.Serializable;

/**
 * 商品类目返回json通用类
 *
 * @author wangss
 * @create 2019-03-09 15:25
 */
public class EasyUITreeNode implements Serializable {

    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
