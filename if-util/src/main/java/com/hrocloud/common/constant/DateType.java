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
public enum DateType implements ValueListEnum{

    WORKDAY(1,"01workday") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "工作日";
        }
    },
    WEEKEND(2,"02weekend") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "休息日";
        }
    },
    HOLIDAY(3,"03holiday") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "节假日";
        }
    };

    public static DateType keyOf(int key) {
        switch (key) {
            case 1:
                return WORKDAY;
            case 2:
                return WEEKEND;
            case 3:
                return HOLIDAY;
            default:
                return WORKDAY;
        }
    }
    public static DateType codeOf(String code) {
        switch (code) {
            case "01workday":
                return WORKDAY;
            case "02weekend":
                return WEEKEND;
            case "03holiday":
                return HOLIDAY;
            default:
                return WORKDAY;
        }
    }


    private int key;
    private String code;
    public String getCode(){
        return code;
    }

    DateType(int key, String code) {
        this.setKey(key);
        this.setCode(code);
    }

//    public abstract String getDesc();

    /**
     * @return the key
     */
    public int getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(int key) {
        this.key = key;
    }


    public void setCode(String code) {
        this.code = code;
    }
}
