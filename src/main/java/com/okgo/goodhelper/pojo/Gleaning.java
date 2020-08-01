package com.okgo.goodhelper.pojo;

import java.util.Date;
import javax.persistence.*;

public class Gleaning {
    /**
     * 用户标识
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 报失/拾遗物品id
     */
    @Id
    @Column(name = "gln_id")
    private Integer glnId;

    /**
     * 联系方式
     */
    @Id
    private String contact;

    /**
     * 物品名称
     */
    @Column(name = "gln_name")
    private String glnName;

    /**
     * 物品图片
     */
    private String image;

    /**
     * 物品描述
     */
    private String description;

    /**
     * 报失/拾遗时间
     */
    @Column(name = "gln_time")
    private String glnTime;

    /**
     * 报失/拾遗地址
     */
    private String address;

    /**
     * 是否公开；0公开，1仅校友可见
     */
    @Column(name = "is_public")
    private String isPublic;

    /**
     * 帖子发布时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 帖子失效时间
     */
    @Column(name = "failure_time")
    private Date failureTime;

    /**
     * 标识；0报失，1拾遗
     */
    private String type;

    /**
     * 状态；0失效，1有效
     */
    private String status;

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
     * 获取报失/拾遗物品id
     *
     * @return gln_id - 报失/拾遗物品id
     */
    public Integer getGlnId() {
        return glnId;
    }

    /**
     * 设置报失/拾遗物品id
     *
     * @param glnId 报失/拾遗物品id
     */
    public void setGlnId(Integer glnId) {
        this.glnId = glnId;
    }

    /**
     * 获取联系方式
     *
     * @return contact - 联系方式
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系方式
     *
     * @param contact 联系方式
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取物品名称
     *
     * @return gln_name - 物品名称
     */
    public String getGlnName() {
        return glnName;
    }

    /**
     * 设置物品名称
     *
     * @param glnName 物品名称
     */
    public void setGlnName(String glnName) {
        this.glnName = glnName;
    }

    /**
     * 获取物品图片
     *
     * @return image - 物品图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置物品图片
     *
     * @param image 物品图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取物品描述
     *
     * @return description - 物品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置物品描述
     *
     * @param description 物品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取报失/拾遗时间
     *
     * @return gln_time - 报失/拾遗时间
     */
    public String getGlnTime() {
        return glnTime;
    }

    /**
     * 设置报失/拾遗时间
     *
     * @param glnTime 报失/拾遗时间
     */
    public void setGlnTime(String glnTime) {
        this.glnTime = glnTime;
    }

    /**
     * 获取报失/拾遗地址
     *
     * @return address - 报失/拾遗地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置报失/拾遗地址
     *
     * @param address 报失/拾遗地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取是否公开；0公开，1仅校友可见
     *
     * @return is_public - 是否公开；0公开，1仅校友可见
     */
    public String getIsPublic() {
        return isPublic;
    }

    /**
     * 设置是否公开；0公开，1仅校友可见
     *
     * @param isPublic 是否公开；0公开，1仅校友可见
     */
    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * 获取帖子发布时间
     *
     * @return create_time - 帖子发布时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置帖子发布时间
     *
     * @param createTime 帖子发布时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取帖子失效时间
     *
     * @return failure_time - 帖子失效时间
     */
    public Date getFailureTime() {
        return failureTime;
    }

    /**
     * 设置帖子失效时间
     *
     * @param failureTime 帖子失效时间
     */
    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    /**
     * 获取标识；0报失，1拾遗
     *
     * @return type - 标识；0报失，1拾遗
     */
    public String getType() {
        return type;
    }

    /**
     * 设置标识；0报失，1拾遗
     *
     * @param type 标识；0报失，1拾遗
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取状态；0失效，1有效
     *
     * @return status - 状态；0失效，1有效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态；0失效，1有效
     *
     * @param status 状态；0失效，1有效
     */
    public void setStatus(String status) {
        this.status = status;
    }
}