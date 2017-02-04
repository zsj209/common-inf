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
public enum SzFrequency implements ValueListEnum{

    BYMONTH(1,"01bymonth") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "按月";
        }
    },
    BYQUARTER(2,"02byquarter") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "按季";
        }
    },
    BYHALFYEAR(3,"03byhalfyear") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "按半年";
        }
    },
    BYYEAR(4,"04byyear") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "按年";
        }
    };

    public static SzFrequency keyOf(int key) {
        switch (key) {
            case 1:
                return BYMONTH;
            case 2:
                return BYQUARTER;
            case 3:
                return BYHALFYEAR;
            case 4:
                return BYYEAR;
            default:
                return BYMONTH;
        }
    }
    public static SzFrequency codeOf(String code) {
        switch (code) {
            case "01bymonth":
                return BYMONTH;
            case "02byquarter":
                return BYQUARTER;
            case "03byhalfyear":
                return BYHALFYEAR;
            case "04byyear":
                return BYYEAR;
            default:
                return BYMONTH;
        }
    }


    private int key;
    private String code;
    public String getCode(){
        return this.code;
    }

    SzFrequency(int key, String code) {
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
