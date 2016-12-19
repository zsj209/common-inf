/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.api.query;


import com.hrocloud.common.api.model.BaseObj;

public class PageQuery<T> extends BaseObj {
    private static final long serialVersionUID = 5923704824865374792L;

    private T query;

    private int pageNo = 1;

    private int pageSize = 10;

    private boolean countRequired = true;


    public PageQuery(T q) {
        this.query = q;
    }

    public PageQuery(T q, int pn) {
        this.query = q;
        this.pageNo = pn;
    }


    public PageQuery(T q, int pn, int ps) {
        this.query = q;
        this.pageNo = pn;
        this.pageSize = ps;
    }

    public T getQuery() {
        return query;
    }

    public void setQuery(T query) {
        this.query = query;
    }

    public int getStartRow() {
        return (pageNo - 1) * pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isCountRequired() {
        return countRequired;
    }

    public void setCountRequired(boolean countRequired) {
        this.countRequired = countRequired;
    }
}
