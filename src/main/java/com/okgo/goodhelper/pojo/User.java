package com.okgo.goodhelper.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private Integer user_id;
    private String wx_name;
    private String avatar;
    private String gender;
    private String country;
    private String province;
    private String city;
    private String language;
    private String openid;
    private String is_alumni;
    @JsonFormat(pattern = "yy-mm-dd hh:mm:ss",locale = "zh",timezone = "GMT-8")
    private Date create_time;
    @JsonFormat(pattern = "yy-mm-dd hh:mm:ss",locale = "zh",timezone = "GMT-8")
    private Date update_time;

    public User(){

    }

    public User(Integer user_id, String wx_name, String avatar, String gender, String country, String province, String city, String language, String openid, String is_alumni, Date create_time, Date update_time) {
        this.user_id = user_id;
        this.wx_name = wx_name;
        this.avatar = avatar;
        this.gender = gender;
        this.country = country;
        this.province = province;
        this.city = city;
        this.language = language;
        this.openid = openid;
        this.is_alumni = is_alumni;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", wx_name='" + wx_name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", language='" + language + '\'' +
                ", openid='" + openid + '\'' +
                ", is_alumni='" + is_alumni + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getWx_name() {
        return wx_name;
    }

    public void setWx_name(String wx_name) {
        this.wx_name = wx_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getIs_alumni() {
        return is_alumni;
    }

    public void setIs_alumni(String is_alumni) {
        this.is_alumni = is_alumni;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
