package com.dc.sb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @Auther: zj
 * @Date: 2018/10/24 15:49
 * @Description:
 * 订单
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {

    /** 商品图片地址*/
    private String imgUrl;
    /** 订单号*/
    private String orderNo;
    /** 订单数量*/
    private String orderNum;
    /** 订单状态*/
    private String status;
    /** 金额*/
    private String je;
    /** 下单时间*/
    private Date inputDate;
    /** 商品名称*/
    private String goodsName;
    /** 商品描述*/
    private String goodsDesc;

}
