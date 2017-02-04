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
public enum YesOrNo implements ValueListEnum {

    YES(1,"1") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "是";
        }
    },
    NO(2,"0") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "否";
        }
    };

    public static YesOrNo keyOf(int key) {
        switch (key) {
            case 1:
                return YES;
            case 2:
                return NO;
            default:
                return YES;
        }
    }
    public static YesOrNo codeOf(String code) {
        switch (code) {
            case "1":
                return YES;
            case "0":
                return NO;
            default:
                return YES;
        }
    }
    private int key;

    private String code;

    public String getCode() {
        return code;
    }


    YesOrNo(int key, String code) {
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
