/**
 * hrocloud.com Inc.
 * Copyright (c) 2015-2016 All Rights Reserved.
 */
package com.hrocloud.common.api.model;

/**
 * Created by zou_s on 2016/12/26.
 */
public class CaptchaTemplate {
    Integer width;
    Integer height;
    String bgColor;
    String borderColor;
    int interferingMax;
    int interferingMin;
    String font;
    int fontHeight;

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int getFontHeight() {
        return fontHeight;
    }

    public void setFontHeight(int fontHeight) {
        this.fontHeight = fontHeight;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public int getInterferingMax() {
        return interferingMax;
    }

    public void setInterferingMax(int interferingMax) {
        this.interferingMax = interferingMax;
    }

    public int getInterferingMin() {
        return interferingMin;
    }

    public void setInterferingMin(int interferingMin) {
        this.interferingMin = interferingMin;
    }
}
