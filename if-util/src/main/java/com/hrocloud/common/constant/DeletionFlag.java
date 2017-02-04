/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.constant;

/**
 * 订单状态 *
 * 实现带有抽象方法的枚举 *
 *
 * @author Stanley Zou
 */
public enum DeletionFlag implements  ValueListEnum{

    ACTIVE(1) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "正常";
        }
    },
    DELETED(2) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "已删除";
        }
    };

    public static DeletionFlag keyOf(int key) {
        switch (key) {
            case 1:
                return ACTIVE;
            case 2:
                return DELETED;
            default:
                return ACTIVE;
        }
    }

    public static DeletionFlag codeOf(String code) {
        switch (code) {
            case "ACTIVE":
                return ACTIVE;
            case "DELETED":
                return DELETED;
            default:
                return ACTIVE;
        }
    }

    private int key;

    DeletionFlag(int key) {
        this.setKey(key);
    }

//    public abstract String getDesc();

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    public String getCode(){
        return toString();
    }
    /**
     * @param key the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }


}
