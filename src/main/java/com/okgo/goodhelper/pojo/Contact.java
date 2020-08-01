package com.okgo.goodhelper.pojo;

import javax.persistence.*;

public class Contact {
    /**
     * ��ϵ��ʽ��ʶ
     */
    @Id
    @Column(name = "contact_id")
    private Integer contactId;

    /**
     * �û���ʶ
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * ��ϵ��ʽ��0�ֻ��ţ�1΢�ţ�2QQ��3����
     */
    private String type;

    /**
     * ����
     */
    private String number;

    /**
     * ��ȡ��ϵ��ʽ��ʶ
     *
     * @return contact_id - ��ϵ��ʽ��ʶ
     */
    public Integer getContactId() {
        return contactId;
    }

    /**
     * ������ϵ��ʽ��ʶ
     *
     * @param contactId ��ϵ��ʽ��ʶ
     */
    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    /**
     * ��ȡ�û���ʶ
     *
     * @return user_id - �û���ʶ
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * �����û���ʶ
     *
     * @param userId �û���ʶ
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ��ϵ��ʽ��0�ֻ��ţ�1΢�ţ�2QQ��3����
     *
     * @return type - ��ϵ��ʽ��0�ֻ��ţ�1΢�ţ�2QQ��3����
     */
    public String getType() {
        return type;
    }

    /**
     * ������ϵ��ʽ��0�ֻ��ţ�1΢�ţ�2QQ��3����
     *
     * @param type ��ϵ��ʽ��0�ֻ��ţ�1΢�ţ�2QQ��3����
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡ����
     *
     * @return number - ����
     */
    public String getNumber() {
        return number;
    }

    /**
     * ���ú���
     *
     * @param number ����
     */
    public void setNumber(String number) {
        this.number = number;
    }
}