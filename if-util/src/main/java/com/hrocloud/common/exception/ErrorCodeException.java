/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.exception;

import com.hrocloud.apigw.client.define.AbstractReturnCode;

/**
 * Created by zou_s on 2017/1/16.
 */
public class ErrorCodeException extends RuntimeException {
    private static final long serialVersionUID = 5674089106259423446L;
    /**
     * 错误码对象
     */
    private AbstractReturnCode agwErrorCode;

    public ErrorCodeException(AbstractReturnCode agwErrorCode){
        this.agwErrorCode = agwErrorCode;
    }

    public AbstractReturnCode getAgwErrorCode() {
        return agwErrorCode;
    }

    public void setAgwErrorCode(AbstractReturnCode agwErrorCode) {
        this.agwErrorCode = agwErrorCode;
    }

}

