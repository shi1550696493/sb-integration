package com.dc.sb.entity;

import lombok.Data;

/**
 * @Auther: zj
 * @Date: 2018/10/23 10:27
 * @Description:
 */
@Data
public class BuyCartGoods {
    /** 商品id*/
    private String id;
    /** 购买数量*/
    private String num;

    private boolean isChecked;
    private String imgUrl;
    private String desc;
    private double price;
    private int countPrice;

}

