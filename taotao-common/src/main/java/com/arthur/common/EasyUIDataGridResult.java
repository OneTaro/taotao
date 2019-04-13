package com.arthur.common;

import java.io.Serializable;
import java.util.List;

/**
 * 封装json根元素工具类
 *
 * @author wangss
 * @create 2019-03-07 22:07
 */
public class EasyUIDataGridResult implements Serializable {

    private long total;

    private List rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
