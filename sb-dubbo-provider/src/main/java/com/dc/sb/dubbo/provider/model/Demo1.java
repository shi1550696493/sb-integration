package com.dc.sb.dubbo.provider.model;

import java.util.Date;

public class Demo1 {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo1.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo1.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo1.input
     *
     * @mbggenerated
     */
    private Date input;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column demo1.desc
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo1
     *
     * @mbggenerated
     */
    public Demo1(Integer id, String name, Date input, String desc) {
        this.id = id;
        this.name = name;
        this.input = input;
        this.desc = desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo1.id
     *
     * @return the value of demo1.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo1.name
     *
     * @return the value of demo1.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo1.input
     *
     * @return the value of demo1.input
     *
     * @mbggenerated
     */
    public Date getInput() {
        return input;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column demo1.desc
     *
     * @return the value of demo1.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }
}