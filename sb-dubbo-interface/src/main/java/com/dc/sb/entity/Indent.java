package com.dc.sb.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Indent implements Serializable {
    private Integer id;

    private String serialNumber;

    private String orderTime;

    private Integer uid;

    private Double orderMoney;


}