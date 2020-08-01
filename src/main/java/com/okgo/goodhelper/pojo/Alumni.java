package com.okgo.goodhelper.pojo;

import javax.persistence.*;

public class Alumni {
    /**
     * 用户标识
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 校友标识
     */
    @Column(name = "alumni_id")
    private Integer alumniId;

    /**
     * 学院
     */
    private String faculty;

    /**
     * 专业
     */
    private String major;

    /**
     * 班级
     */
    private String classes;

    /**
     * 学号
     */
    private String number;

    /**
     * 姓名
     */
    @Column(name = "alm_name")
    private String almName;

    /**
     * 认证时间
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
     * 获取校友标识
     *
     * @return alumni_id - 校友标识
     */
    public Integer getAlumniId() {
        return alumniId;
    }

    /**
     * 设置校友标识
     *
     * @param alumniId 校友标识
     */
    public void setAlumniId(Integer alumniId) {
        this.alumniId = alumniId;
    }

    /**
     * 获取学院
     *
     * @return faculty - 学院
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * 设置学院
     *
     * @param faculty 学院
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * 获取专业
     *
     * @return major - 专业
     */
    public String getMajor() {
        return major;
    }

    /**
     * 设置专业
     *
     * @param major 专业
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * 获取班级
     *
     * @return class - 班级
     */
    public String getClasses() {
        return classes;
    }

    /**
     * 设置班级
     *
     * @param classes 班级
     */
    public void setClass(String classes) {
        this.classes = classes;
    }

    /**
     * 获取学号
     *
     * @return number - 学号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置学号
     *
     * @param number 学号
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 获取姓名
     *
     * @return alm_name - 姓名
     */
    public String getAlmName() {
        return almName;
    }

    /**
     * 设置姓名
     *
     * @param almName 姓名
     */
    public void setAlmName(String almName) {
        this.almName = almName;
    }

    /**
     * 获取认证时间
     *
     * @return create_time - 认证时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置认证时间
     *
     * @param createTime 认证时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}