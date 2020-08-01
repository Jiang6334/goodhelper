package com.okgo.goodhelper.pojo;

import java.util.Date;
import javax.persistence.*;

public class Good {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * ��Ʒ�ı�ʶ
     */
    @Id
    @Column(name = "good_id")
    private Integer goodId;

    /**
     * ���
     */
    @Id
    private String category;

    /**
     * ������ϵ��ʽ
     */
    @Id
    private String contact;

    /**
     * ����
     */
    @Column(name = "good_name")
    private String goodName;

    /**
     * ͼƬ
     */
    private String image;

    /**
     * ����
     */
    private String description;

    /**
     * ���ۼ۸�
     */
    @Column(name = "sell_price")
    private String sellPrice;

    /**
     * ����۸�
     */
    @Column(name = "bid_price")
    private String bidPrice;

    /**
     * �Ƿ�ȫ�£�0���֣�1ȫ��
     */
    @Column(name = "is_new")
    private Boolean isNew;

    /**
     * �Ƿ񽲼ۣ�0�����ۣ�1�ɽ���
     */
    @Column(name = "is_bargain")
    private Boolean isBargain;

    /**
     * �Ƿ񹫿���0������1��У�ѿɼ�
     */
    @Column(name = "is_public")
    private Boolean isPublic;

    /**
     * �Ƿ���ѣ�0����ѣ�1���
     */
    @Column(name = "is_free")
    private Boolean isFree;

    /**
     * �û��Զ����ǩ
     */
    private String tag;

    /**
     * ���׵ص�
     */
    @Column(name = "trade_place")
    private String tradePlace;

    /**
     * ��Ϣ״̬��0ʧЧ��1����
     */
    private String status;

    /**
     * ����ʱ��
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * ��Ϣ����ʱ��
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * ��ȡ��Ʒ�ı�ʶ
     *
     * @return good_id - ��Ʒ�ı�ʶ
     */
    public Integer getGoodId() {
        return goodId;
    }

    /**
     * ������Ʒ�ı�ʶ
     *
     * @param goodId ��Ʒ�ı�ʶ
     */
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    /**
     * ��ȡ���
     *
     * @return category - ���
     */
    public String getCategory() {
        return category;
    }

    /**
     * �������
     *
     * @param category ���
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * ��ȡ������ϵ��ʽ
     *
     * @return contact - ������ϵ��ʽ
     */
    public String getContact() {
        return contact;
    }

    /**
     * ����������ϵ��ʽ
     *
     * @param contact ������ϵ��ʽ
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * ��ȡ����
     *
     * @return good_name - ����
     */
    public String getGoodName() {
        return goodName;
    }

    /**
     * ��������
     *
     * @param goodName ����
     */
    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    /**
     * ��ȡͼƬ
     *
     * @return image - ͼƬ
     */
    public String getImage() {
        return image;
    }

    /**
     * ����ͼƬ
     *
     * @param image ͼƬ
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ��ȡ����
     *
     * @return description - ����
     */
    public String getDescription() {
        return description;
    }

    /**
     * ��������
     *
     * @param description ����
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * ��ȡ���ۼ۸�
     *
     * @return sell_price - ���ۼ۸�
     */
    public String getSellPrice() {
        return sellPrice;
    }

    /**
     * ���ó��ۼ۸�
     *
     * @param sellPrice ���ۼ۸�
     */
    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    /**
     * ��ȡ����۸�
     *
     * @return bid_price - ����۸�
     */
    public String getBidPrice() {
        return bidPrice;
    }

    /**
     * ��������۸�
     *
     * @param bidPrice ����۸�
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * ��ȡ�Ƿ�ȫ�£�0���֣�1ȫ��
     *
     * @return is_new - �Ƿ�ȫ�£�0���֣�1ȫ��
     */
    public Boolean getIsNew() {
        return isNew;
    }

    /**
     * �����Ƿ�ȫ�£�0���֣�1ȫ��
     *
     * @param isNew �Ƿ�ȫ�£�0���֣�1ȫ��
     */
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * ��ȡ�Ƿ񽲼ۣ�0�����ۣ�1�ɽ���
     *
     * @return is_bargain - �Ƿ񽲼ۣ�0�����ۣ�1�ɽ���
     */
    public Boolean getIsBargain() {
        return isBargain;
    }

    /**
     * �����Ƿ񽲼ۣ�0�����ۣ�1�ɽ���
     *
     * @param isBargain �Ƿ񽲼ۣ�0�����ۣ�1�ɽ���
     */
    public void setIsBargain(Boolean isBargain) {
        this.isBargain = isBargain;
    }

    /**
     * ��ȡ�Ƿ񹫿���0������1��У�ѿɼ�
     *
     * @return is_public - �Ƿ񹫿���0������1��У�ѿɼ�
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    /**
     * �����Ƿ񹫿���0������1��У�ѿɼ�
     *
     * @param isPublic �Ƿ񹫿���0������1��У�ѿɼ�
     */
    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * ��ȡ�Ƿ���ѣ�0����ѣ�1���
     *
     * @return is_free - �Ƿ���ѣ�0����ѣ�1���
     */
    public Boolean getIsFree() {
        return isFree;
    }

    /**
     * �����Ƿ���ѣ�0����ѣ�1���
     *
     * @param isFree �Ƿ���ѣ�0����ѣ�1���
     */
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    /**
     * ��ȡ�û��Զ����ǩ
     *
     * @return tag - �û��Զ����ǩ
     */
    public String getTag() {
        return tag;
    }

    /**
     * �����û��Զ����ǩ
     *
     * @param tag �û��Զ����ǩ
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * ��ȡ���׵ص�
     *
     * @return trade_place - ���׵ص�
     */
    public String getTradePlace() {
        return tradePlace;
    }

    /**
     * ���ý��׵ص�
     *
     * @param tradePlace ���׵ص�
     */
    public void setTradePlace(String tradePlace) {
        this.tradePlace = tradePlace;
    }

    /**
     * ��ȡ��Ϣ״̬��0ʧЧ��1����
     *
     * @return status - ��Ϣ״̬��0ʧЧ��1����
     */
    public String getStatus() {
        return status;
    }

    /**
     * ������Ϣ״̬��0ʧЧ��1����
     *
     * @param status ��Ϣ״̬��0ʧЧ��1����
     */
    public void setStatus(String status) {
        this.status = status;
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

    /**
     * ��ȡ��Ϣ����ʱ��
     *
     * @return update_time - ��Ϣ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ������Ϣ����ʱ��
     *
     * @param updateTime ��Ϣ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}