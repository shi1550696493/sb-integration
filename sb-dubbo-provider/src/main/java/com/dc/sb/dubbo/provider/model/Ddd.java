package com.dc.sb.dubbo.provider.model;

public class Ddd {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddd.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddd.smail_img
     *
     * @mbggenerated
     */
    private String smailImg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddd.goods_name
     *
     * @mbggenerated
     */
    private String goodsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ddd.goods_desc
     *
     * @mbggenerated
     */
    private String goodsDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddd
     *
     * @mbggenerated
     */
    public Ddd(Integer id, String smailImg, String goodsName, String goodsDesc) {
        this.id = id;
        this.smailImg = smailImg;
        this.goodsName = goodsName;
        this.goodsDesc = goodsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddd.id
     *
     * @return the value of ddd.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddd.smail_img
     *
     * @return the value of ddd.smail_img
     *
     * @mbggenerated
     */
    public String getSmailImg() {
        return smailImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddd.goods_name
     *
     * @return the value of ddd.goods_name
     *
     * @mbggenerated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ddd.goods_desc
     *
     * @return the value of ddd.goods_desc
     *
     * @mbggenerated
     */
    public String getGoodsDesc() {
        return goodsDesc;
    }
}