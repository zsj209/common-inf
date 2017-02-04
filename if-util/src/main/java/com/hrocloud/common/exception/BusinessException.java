/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.exception;

/**
 *
 * Created by zou_s on 2017/1/16.
 */

public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = 8689355749747651720L;
    /**
     * 错误码，全局唯一
     */
    private int errorCode;
    /**
     * 错误描述
     */
    private String desc;

    public BusinessException(int errorCode, String desc){
        this.setErrorCode(errorCode);
        this.setDesc(desc);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
