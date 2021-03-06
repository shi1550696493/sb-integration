package com.dc.sb.dubbo.provider.model;

import java.math.BigDecimal;
import java.util.Date;

public class TGoods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.smail_img
     *
     * @mbggenerated
     */
    private String smailImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_name
     *
     * @mbggenerated
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_desc
     *
     * @mbggenerated
     */
    private String goodsDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.input_date
     *
     * @mbggenerated
     */
    private Date inputDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.update_date
     *
     * @mbggenerated
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_type_id
     *
     * @mbggenerated
     */
    private String goodsTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.goods_kc
     *
     * @mbggenerated
     */
    private Integer goodsKc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods.buy_xz_num
     *
     * @mbggenerated
     */
    private Integer buyXzNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods
     *
     * @mbggenerated
     */
    public TGoods(String id, String smailImg, String goodsName, String goodsDesc, BigDecimal price, Date inputDate, Date updateDate, String status, String goodsTypeId, Integer goodsKc, Integer buyXzNum) {
        this.id = id;
        this.smailImg = smailImg;
        this.goodsName = goodsName;
        this.goodsDesc = goodsDesc;
        this.price = price;
        this.inputDate = inputDate;
        this.updateDate = updateDate;
        this.status = status;
        this.goodsTypeId = goodsTypeId;
        this.goodsKc = goodsKc;
        this.buyXzNum = buyXzNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.id
     *
     * @return the value of t_goods.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.smail_img
     *
     * @return the value of t_goods.smail_img
     *
     * @mbggenerated
     */
    public String getSmailImg() {
        return smailImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_name
     *
     * @return the value of t_goods.goods_name
     *
     * @mbggenerated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_desc
     *
     * @return the value of t_goods.goods_desc
     *
     * @mbggenerated
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.price
     *
     * @return the value of t_goods.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.input_date
     *
     * @return the value of t_goods.input_date
     *
     * @mbggenerated
     */
    public Date getInputDate() {
        return inputDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.update_date
     *
     * @return the value of t_goods.update_date
     *
     * @mbggenerated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.status
     *
     * @return the value of t_goods.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_type_id
     *
     * @return the value of t_goods.goods_type_id
     *
     * @mbggenerated
     */
    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.goods_kc
     *
     * @return the value of t_goods.goods_kc
     *
     * @mbggenerated
     */
    public Integer getGoodsKc() {
        return goodsKc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods.buy_xz_num
     *
     * @return the value of t_goods.buy_xz_num
     *
     * @mbggenerated
     */
    public Integer getBuyXzNum() {
        return buyXzNum;
    }
}