/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.dao;

import com.hrocloud.common.api.model.BaseObj;
/**
 * Created by zou_s on 2017/1/6.
 */
public interface HroBaseMapper <T extends BaseObj> {
    int deleteByPrimaryKey(Integer id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
