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
public enum PoliticalState implements ValueListEnum {

    COMMON(1) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "群众";
        }
    },
    LEAGUE(2) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "共青团员";
        }
    },
    PARTY(3) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "中共党员";
        }
    },
    OTHER(4) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "其它";
        }
    };

    public static PoliticalState keyOf(int key) {
        switch (key) {
            case 1:
                return COMMON;
            case 2:
                return LEAGUE;
            case 3:
                return PARTY;
            case 4:
                return OTHER;
            default:
                return null;
        }
    }
    public static PoliticalState codeOf(String code) {
        switch (code) {
            case "COMMON":
                return COMMON;
            case "LEAGUE":
                return LEAGUE;
            case "PARTY":
                return PARTY;
            case "OTHER":
                return OTHER;
            default:
                return null;
        }
    }
    private int key;
    public String getCode(){
        return toString();
    }

    PoliticalState(int key) {
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
