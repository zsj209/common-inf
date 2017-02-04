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
public enum Gender implements  ValueListEnum{

    MALE(1, "01male") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "男";
        }
    },
    FEMALE(2, "02female") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "女";
        }
    },
    OTHER(3, "03other") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "保密";
        }
    };

    public static Gender keyOf(int key) {
        switch (key) {
            case 1:
                return MALE;
            case 2:
                return FEMALE;
            case 3:
                return OTHER;
            default:
                return MALE;
        }
    }

    public static Gender codeOf(String code) {
        switch (code) {
            case "02female":
                return FEMALE;
            case "01male":
                return MALE;
            case "03other":
                return OTHER;
            default:
                return MALE;
        }
    }
    public String getCode(){
        return code;
    }
    private int key;
    private String code;

    Gender(int key, String code) {
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
