package com.okgo.goodhelper.pojo;

import javax.persistence.*;

@Table(name = "user_favor")
public class UserFavor {
    @Id
    private Integer id;

    @Column(name = "openID")
    private String openid;

    @Column(name = "goodID")
    private String goodid;

    @Column(name = "favorTime")
    private String favortime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return openID
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * @return goodID
     */
    public String getGoodid() {
        return goodid;
    }

    /**
     * @param goodid
     */
    public void setGoodid(String goodid) {
        this.goodid = goodid;
    }

    /**
     * @return favorTime
     */
    public String getFavortime() {
        return favortime;
    }

    /**
     * @param favortime
     */
    public void setFavortime(String favortime) {
        this.favortime = favortime;
    }
}