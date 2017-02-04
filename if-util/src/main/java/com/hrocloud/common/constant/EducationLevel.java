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
public enum EducationLevel implements ValueListEnum {

    PRIMARY(1) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "小学";
        }
    },
    JUNIOR(2) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "初中";
        }
    },
    HIGH(3) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "高中";
        }
    },
    COLLEGE(4) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "大专";
        }
    },
    BACHELOR(5) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "大学本科";
        }
    },
    MASTER(6) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "硕士研究生";
        }
    },
    DOCTOR(7) {
        @Override
        public String getDesc() {
            // TODO Auto-generated method stub
            return "博士研究生";
        }
    };

    public static EducationLevel keyOf(int key) {
        switch (key) {
            case 1:
                return PRIMARY;
            case 2:
                return JUNIOR;
            case 3:
                return HIGH;
            case 4:
                return COLLEGE;
            case 5:
                return BACHELOR;
            case 6:
                return MASTER;
            case 7:
                return DOCTOR;
            default:
                return null;

        }
    }

    public static EducationLevel codeOf(String code) {
        switch (code) {
            case "PRIMARY":
                return PRIMARY;
            case "JUNIOR":
                return JUNIOR;
            case "HIGH":
                return HIGH;
            case "COLLEGE":
                return COLLEGE;
            case "BACHELOR":
                return BACHELOR;
            case "MASTER":
                return MASTER;
            case "DOCTOR":
                return DOCTOR;
            default:
                return null;

        }
    }

    public String getCode(){
        return toString();
    }
    private int key;

    EducationLevel(int key) {
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
