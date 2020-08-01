package com.okgo.goodhelper.pojo;

import java.util.Date;
import javax.persistence.*;

public class Gleaning {
    /**
     * �û���ʶ
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * ��ʧ/ʰ����Ʒid
     */
    @Id
    @Column(name = "gln_id")
    private Integer glnId;

    /**
     * ��ϵ��ʽ
     */
    @Id
    private String contact;

    /**
     * ��Ʒ����
     */
    @Column(name = "gln_name")
    private String glnName;

    /**
     * ��ƷͼƬ
     */
    private String image;

    /**
     * ��Ʒ����
     */
    private String description;

    /**
     * ��ʧ/ʰ��ʱ��
     */
    @Column(name = "gln_time")
    private String glnTime;

    /**
     * ��ʧ/ʰ�ŵ�ַ
     */
    private String address;

    /**
     * �Ƿ񹫿���0������1��У�ѿɼ�
     */
    @Column(name = "is_public")
    private String isPublic;

    /**
     * ���ӷ���ʱ��
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * ����ʧЧʱ��
     */
    @Column(name = "failure_time")
    private Date failureTime;

    /**
     * ��ʶ��0��ʧ��1ʰ��
     */
    private String type;

    /**
     * ״̬��0ʧЧ��1��Ч
     */
    private String status;

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
     * ��ȡ��ʧ/ʰ����Ʒid
     *
     * @return gln_id - ��ʧ/ʰ����Ʒid
     */
    public Integer getGlnId() {
        return glnId;
    }

    /**
     * ���ñ�ʧ/ʰ����Ʒid
     *
     * @param glnId ��ʧ/ʰ����Ʒid
     */
    public void setGlnId(Integer glnId) {
        this.glnId = glnId;
    }

    /**
     * ��ȡ��ϵ��ʽ
     *
     * @return contact - ��ϵ��ʽ
     */
    public String getContact() {
        return contact;
    }

    /**
     * ������ϵ��ʽ
     *
     * @param contact ��ϵ��ʽ
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return gln_name - ��Ʒ����
     */
    public String getGlnName() {
        return glnName;
    }

    /**
     * ������Ʒ����
     *
     * @param glnName ��Ʒ����
     */
    public void setGlnName(String glnName) {
        this.glnName = glnName;
    }

    /**
     * ��ȡ��ƷͼƬ
     *
     * @return image - ��ƷͼƬ
     */
    public String getImage() {
        return image;
    }

    /**
     * ������ƷͼƬ
     *
     * @param image ��ƷͼƬ
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return description - ��Ʒ����
     */
    public String getDescription() {
        return description;
    }

    /**
     * ������Ʒ����
     *
     * @param description ��Ʒ����
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ��ȡ��ʧ/ʰ��ʱ��
     *
     * @return gln_time - ��ʧ/ʰ��ʱ��
     */
    public String getGlnTime() {
        return glnTime;
    }

    /**
     * ���ñ�ʧ/ʰ��ʱ��
     *
     * @param glnTime ��ʧ/ʰ��ʱ��
     */
    public void setGlnTime(String glnTime) {
        this.glnTime = glnTime;
    }

    /**
     * ��ȡ��ʧ/ʰ�ŵ�ַ
     *
     * @return address - ��ʧ/ʰ�ŵ�ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * ���ñ�ʧ/ʰ�ŵ�ַ
     *
     * @param address ��ʧ/ʰ�ŵ�ַ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ�Ƿ񹫿���0������1��У�ѿɼ�
     *
     * @return is_public - �Ƿ񹫿���0������1��У�ѿɼ�
     */
    public String getIsPublic() {
        return isPublic;
    }

    /**
     * �����Ƿ񹫿���0������1��У�ѿɼ�
     *
     * @param isPublic �Ƿ񹫿���0������1��У�ѿɼ�
     */
    public void setIsPublic(String isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * ��ȡ���ӷ���ʱ��
     *
     * @return create_time - ���ӷ���ʱ��
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * �������ӷ���ʱ��
     *
     * @param createTime ���ӷ���ʱ��
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ����ʧЧʱ��
     *
     * @return failure_time - ����ʧЧʱ��
     */
    public Date getFailureTime() {
        return failureTime;
    }

    /**
     * ��������ʧЧʱ��
     *
     * @param failureTime ����ʧЧʱ��
     */
    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
    }

    /**
     * ��ȡ��ʶ��0��ʧ��1ʰ��
     *
     * @return type - ��ʶ��0��ʧ��1ʰ��
     */
    public String getType() {
        return type;
    }

    /**
     * ���ñ�ʶ��0��ʧ��1ʰ��
     *
     * @param type ��ʶ��0��ʧ��1ʰ��
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡ״̬��0ʧЧ��1��Ч
     *
     * @return status - ״̬��0ʧЧ��1��Ч
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����״̬��0ʧЧ��1��Ч
     *
     * @param status ״̬��0ʧЧ��1��Ч
     */
    public void setStatus(String status) {
        this.status = status;
    }
}