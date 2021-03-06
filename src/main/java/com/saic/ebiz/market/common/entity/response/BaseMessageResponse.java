package com.saic.ebiz.market.common.entity.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 响应消息基类（公众帐号 -> 普通用户）
 * 
 * 因为微信协议规定xml格式第一个字母大写，所以违反了Java字段小写的规范
 * 
 * @author 何剑
 * @date 2014-09-19
 */
public class BaseMessageResponse {
    // 接受方账号(收到的openID)
    @XStreamAlias("ToUserName")
    private String toUserName;

    // 开发者微信帐号
    @XStreamAlias("FromUserName")
    private String fromUserName;

    // 消息创建时间 （整型）
    @XStreamAlias("CreateTime")
    private long createTime;

    // 消息类型（text/image/voice/video/music/news）
    @XStreamAlias("MsgType")
    private String msgType;

    /**
     * 
     * Get the toUserName
     * 
     * @return the toUserName
     */
    public String getToUserName() {
        return toUserName;
    }

    /**
     * 
     * Set the toUserName
     * 
     * @param toUserName
     *            the toUserName to set
     */
    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    /**
     * 
     * Get the fromUserName
     * 
     * @return the fromUserName
     */
    public String getFromUserName() {
        return fromUserName;
    }

    /**
     * 
     * Set the fromUserName
     * 
     * @param fromUserName
     *            the fromUserName to set
     */
    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    /**
     * 
     * Get the createTime
     * 
     * @return the createTime
     */
    public long getCreateTime() {
        return createTime;
    }

    /**
     * 
     * Set the createTime
     * 
     * @param createTime
     *            the createTime to set
     */
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * Get the msgType
     * 
     * @return the msgType
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * 
     * Set the msgType
     * 
     * @param msgType
     *            the msgType to set
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

}
