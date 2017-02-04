/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.api.service;

import com.hrocloud.common.api.model.BaseObj;
import com.hrocloud.common.dao.HroBaseMapper;

/**
 * Created by zou_s on 2017/1/6.
 */
public interface CommonService<T extends BaseObj> {
    int update(T t);

    int insert(T t);

    T getById(Integer id);

    int deleteById(Integer id);
}
