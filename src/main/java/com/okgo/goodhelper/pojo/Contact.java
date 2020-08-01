package com.okgo.goodhelper.pojo;

import javax.persistence.*;

public class Contact {
    /**
     * 联系方式标识
     */
    @Id
    @Column(name = "contact_id")
    private Integer contactId;

    /**
     * 用户标识
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 联系方式；0手机号，1微信，2QQ，3其他
     */
    private String type;

    /**
     * 号码
     */
    private String number;

    /**
     * 获取联系方式标识
     *
     * @return contact_id - 联系方式标识
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * 设置联系方式标识
     *
     * @param contactId 联系方式标识
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * 获取用户标识
     *
     * @return user_id - 用户标识
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户标识
     *
     * @param userId 用户标识
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取联系方式；0手机号，1微信，2QQ，3其他
     *
     * @return type - 联系方式；0手机号，1微信，2QQ，3其他
     */
    public String getType() {
        return type;
    }

    /**
     * 设置联系方式；0手机号，1微信，2QQ，3其他
     *
     * @param type 联系方式；0手机号，1微信，2QQ，3其他
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取号码
     *
     * @return number - 号码
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置号码
     *
     * @param number 号码
     */
    public void setNumber(String number) {
        this.number = number;
    }
}