package com.okgo.goodhelper.pojo;

import javax.persistence.*;

public class Feedback {
    /**
     * 用户标识
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 反馈标识
     */
    @Id
    @Column(name = "fdb_id")
    private Integer fdbId;

    /**
     * 反馈内容
     */
    private String article;

    /**
     * 反馈时间
     */
    @Column(name = "create_time")
    private String createTime;

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
     * 获取反馈标识
     *
     * @return fdb_id - 反馈标识
     */
    public Integer getFdbId() {
        return fdbId;
    }

    /**
     * 设置反馈标识
     *
     * @param fdbId 反馈标识
     */
    public void setFdbId(Integer fdbId) {
        this.fdbId = fdbId;
    }

    /**
     * 获取反馈内容
     *
     * @return article - 反馈内容
     */
    public String getArticle() {
        return article;
    }

    /**
     * 设置反馈内容
     *
     * @param article 反馈内容
     */
    public void setArticle(String article) {
        this.article = article;
    }

    /**
     * 获取反馈时间
     *
     * @return create_time - 反馈时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置反馈时间
     *
     * @param createTime 反馈时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}