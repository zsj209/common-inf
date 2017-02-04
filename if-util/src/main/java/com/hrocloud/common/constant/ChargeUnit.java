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
public enum ChargeUnit implements ValueListEnum{

    MANMONTH(1,"01manmonth") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "人月";
        }
    },
    MANQUARTER(2,"02manquarter") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "人季";
        }
    },
    MANHALFYEAR(3,"03manhalfyear") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "人半年";
        }
    },
    MANYEAR(4,"04manyear") {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "人年";
        }
    };

    public static ChargeUnit keyOf(int key) {
        switch (key) {
            case 1:
                return MANMONTH;
            case 2:
                return MANQUARTER;
            case 3:
                return MANHALFYEAR;
            case 4:
                return MANYEAR;
            default:
                return MANMONTH;
        }
    }
    public static ChargeUnit codeOf(String code) {
        switch (code) {
            case "01manmonth":
                return MANMONTH;
            case "02manquarter":
                return MANQUARTER;
            case "03manhalfyear":
                return MANHALFYEAR;
            case "04manyear":
                return MANYEAR;
            default:
                return MANMONTH;
        }
    }


    private int key;
    private String code;
    public String getCode(){
        return code;
    }

    ChargeUnit(int key, String code) {
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
