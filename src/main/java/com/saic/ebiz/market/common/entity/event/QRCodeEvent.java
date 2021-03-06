/**
 *
 * Copyright (C), 2013-2013, 上海汽车集团股份有限公司
 * FileName : SubscribeEvent.java
 * Author : 何剑
 * Date : 2014年9月19日
 * 
 */
package com.saic.ebiz.market.common.entity.event;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * 扫描带参数二维码事件
 * @author hejian
 *
 */
@XStreamAlias("xml")
public class QRCodeEvent extends BaseEvent {

    /** 事件KEY值 */
    @XStreamAlias("EventKey")
    private String eventKey;
    
    /** 用于换取二维码事件 */
    @XStreamAlias("Ticket")
    private String ticket;

    /**
     *
     *	Get the eventKey
     *
     * @return the eventKey
     */
    public String getEventKey() {
        return this.eventKey;
    }

    /**
     *
     *	Set the eventKey
     *
     * @param eventKey the eventKey to set
     */
    public void setEventKey(String eventKey) {
        this.eventKey = eventKey;
    }

    /**
     *
     *	Get the ticket
     *
     * @return the ticket
     */
    public String getTicket() {
        return ticket;
    }

    /**
     *
     *	Set the ticket
     *
     * @param ticket the ticket to set
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }
}
