package com.okgo.goodhelper.pojo;

import javax.persistence.*;

public class Category {
    /**
     * 分类标识
     */
    @Id
    @Column(name = "cate_id")
    private Integer cateId;

    /**
     * 名称
     */
    @Column(name = "cate_name")
    private String cateName;

    /**
     * 描述
     */
    private String description;

    /**
     * 获取分类标识
     *
     * @return cate_id - 分类标识
     */
    public Integer getCateId() {
        return cateId;
    }

    /**
     * 设置分类标识
     *
     * @param cateId 分类标识
     */
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    /**
     * 获取名称
     *
     * @return cate_name - 名称
     */
    public String getCateName() {
        return cateName;
    }

    /**
     * 设置名称
     *
     * @param cateName 名称
     */
    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}