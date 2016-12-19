/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.util;

/**
 * domain的定义 *
 * 实现带有抽象方法的枚举 *e
 *
 * @author Stanley Zou
 */
public enum DomainDefine {

    HRO("人力资源外包系统", 1000);

    // 成员变量
    private String name;

    private long index;

    // 构造方法
    private DomainDefine(String name, long index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(long index) {
        for (DomainDefine c : DomainDefine.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

// get set 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getIndex() {
        return index;
    }


    public void setIndex(long index) {
        this.index = index;
    }
}