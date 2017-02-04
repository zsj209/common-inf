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
public enum IdType implements ValueListEnum{

    CERTCARD(1) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "身份证";
        }
    },
    PASSPORT(2) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "护照";
        }
    },
    DRVCARD(3) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "驾驶证";
        }
    };

    public static IdType keyOf(int key) {
        switch (key) {
            case 1:
                return CERTCARD;
            case 2:
                return PASSPORT;
            case 3:
                return DRVCARD;
            default:
                return CERTCARD;
        }
    }
    public static IdType codeOf(String code) {
        switch (code) {
            case "CERTCARD":
                return CERTCARD;
            case "PASSPORT":
                return PASSPORT;
            case "DRVCARD":
                return DRVCARD;
            default:
                return CERTCARD;
        }
    }


    private int key;
    public String getCode(){
        return toString();
    }

    IdType(int key) {
        this.setKey(key);
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


}
