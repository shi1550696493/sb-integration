package com.dc.sb.dubbo.provider.model;

public class TPinpai {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pinpai.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pinpai.pin_pai_name
     *
     * @mbggenerated
     */
    private String pinPaiName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_pinpai.img_url
     *
     * @mbggenerated
     */
    private String imgUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_pinpai
     *
     * @mbggenerated
     */
    public TPinpai(Integer id, String pinPaiName, String imgUrl) {
        this.id = id;
        this.pinPaiName = pinPaiName;
        this.imgUrl = imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pinpai.id
     *
     * @return the value of t_pinpai.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pinpai.pin_pai_name
     *
     * @return the value of t_pinpai.pin_pai_name
     *
     * @mbggenerated
     */
    public String getPinPaiName() {
        return pinPaiName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_pinpai.img_url
     *
     * @return the value of t_pinpai.img_url
     *
     * @mbggenerated
     */
    public String getImgUrl() {
        return imgUrl;
    }
}