package com.dc.sb.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Shoppingcart implements Serializable {
    private Integer id;

    private String userid;

    private String imgurl;

    private String goodsname;

    private String goodsid;

    private String goodsdesc;

    private Integer num;

    private Double price;

}