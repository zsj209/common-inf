/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.api.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created by zou_s on 2016/12/17.
 */
public class BaseObjDto implements Serializable {

    private static final long serialVersionUID = 2103055376564220366L;

    // 各种时间格式
    public static final String date_sdf = "yyyy-MM-dd";
    // 各种时间格式
    public static final String yyyyMMdd = "yyyyMMdd";
    public static final String yyyyMMdd1 = "yyyy-MM-dd";
    public static final String MMSlashdd = "MM/dd";
    // 各种时间格式
    public static final String date_sdf_wz = "yyyy年MM月dd日";
    public static final String time_sdf = "yyyy-MM-dd HH:mm";
    public static final String yyyymmddhhmmss = "yyyyMMddHHmmss";

    public static final String yymmddhhmmss = "yyMMddHHmmss";

    public static final String yyyymmddhhmm = "yyyyMMddHHmm";
    public static final String short_time_sdf = "HH:mm";

    public static final String hhmm = "HHmm";
    public static final String HHmmss = "HHmmss";
    public static final String datetimeFormat = "yyyy-MM-dd HH:mm:ss";

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
