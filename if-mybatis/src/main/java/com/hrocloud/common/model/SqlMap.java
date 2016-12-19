package com.hrocloud.common.model;

import java.io.Serializable;

public class SqlMap implements Serializable {

    private static final long serialVersionUID = 4503715330647393411L;
    private String handle; // 句柄
    private Object param; // 参数

    public SqlMap() {
        super();
    }

    public SqlMap(String handle, Object param) {
        super();
        this.handle = handle;
        this.param = param;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return "SqlMap [handle=" + handle + ", param=" + param + "]";
    }

}
