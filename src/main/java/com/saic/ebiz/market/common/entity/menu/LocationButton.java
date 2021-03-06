/**
 *
 * Copyright (C), 2013-2013, 上海汽车集团股份有限公司
 * FileName : ClickButon.java
 * Author : 何剑
 * Date : 2014年9月21日
 * 
 */
package com.saic.ebiz.market.common.entity.menu;

import com.saic.ebiz.market.common.enumeration.ButtonType;

/**
 * Click类型的按钮
 * 
 * @author hejian
 * 
 * @date 2014年9月21日
 */
public class LocationButton extends Button {
    /** 菜单的响应动作类型 */
    private String type = ButtonType.LOCATION.code();

    /** 菜单KEY值，用于消息接口推送，不超过128字节 */
    private String key;

    /**
     * 
     * Get the key
     * 
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * Set the key
     * 
     * @param key
     *            the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * Get the type
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * Set the type
     * 
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}
