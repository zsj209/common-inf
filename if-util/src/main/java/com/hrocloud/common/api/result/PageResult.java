/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.api.result;

import com.hrocloud.common.api.model.BaseObj;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @param <T>
 */
public class PageResult<T extends Serializable> extends BaseObj {

    private ArrayList<T> models;

    private int count;

    public ArrayList<T> getModels() {
        return models;
    }

    public void setModels(ArrayList<T> models) {
        this.models = models;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
