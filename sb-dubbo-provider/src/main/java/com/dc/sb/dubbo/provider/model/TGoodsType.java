package com.dc.sb.dubbo.provider.model;

public class TGoodsType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_type.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_goods_type.type_name
     *
     * @mbggenerated
     */
    private String typeName;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_goods_type
     *
     * @mbggenerated
     */
    public TGoodsType(String id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_type.id
     *
     * @return the value of t_goods_type.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_goods_type.type_name
     *
     * @return the value of t_goods_type.type_name
     *
     * @mbggenerated
     */
    public String getTypeName() {
        return typeName;
    }
}