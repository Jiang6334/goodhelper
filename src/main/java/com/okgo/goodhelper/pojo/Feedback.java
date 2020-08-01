package com.okgo.goodhelper.pojo;

import javax.persistence.*;

public class Feedback {
    /**
     * �û���ʶ
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * ������ʶ
     */
    @Id
    @Column(name = "fdb_id")
    private Integer fdbId;

    /**
     * ��������
     */
    private String article;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private String createTime;

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
     * ��ȡ������ʶ
     *
     * @return fdb_id - ������ʶ
     */
    public Integer getFdbId() {
        return fdbId;
    }

    /**
     * ���÷�����ʶ
     *
     * @param fdbId ������ʶ
     */
    public void setFdbId(Integer fdbId) {
        this.fdbId = fdbId;
    }

    /**
     * ��ȡ��������
     *
     * @return article - ��������
     */
    public String getArticle() {
        return article;
    }

    /**
     * ���÷�������
     *
     * @param article ��������
     */
    public void setArticle(String article) {
        this.article = article;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return create_time - ����ʱ��
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * ���÷���ʱ��
     *
     * @param createTime ����ʱ��
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}