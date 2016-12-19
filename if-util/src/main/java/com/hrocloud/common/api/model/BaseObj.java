/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016All Rights Reserved.
 */
package com.hrocloud.common.api.model;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by zou_s on 2016/12/15.
 */
public class BaseObj implements Serializable {


    private static final long serialVersionUID = 1032950382516189771L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
